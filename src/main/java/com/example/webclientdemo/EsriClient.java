package com.example.webclientdemo;

import com.example.webclientdemo.esri.model.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.codec.ClientCodecConfigurer;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import static org.springframework.http.MediaType.TEXT_PLAIN;

@Service
public class EsriClient {
    private static final String GITHUB_V3_MIME_TYPE = "text/plain; charset=utf-8";
    private static final String GITHUB_API_BASE_URL = "https://services9.arcgis.com/RHVPKKiFTONKtxq3/ArcGIS/rest/services/Satellite_VIIRS_Thermal_Hotspots_and_Fire_Activity/FeatureServer/0";
    private static final String USER_AGENT = "Spring 5 WebClient";
    private static final Logger logger = LoggerFactory.getLogger(EsriClient.class);

    private final WebClient webClient;

    @Autowired
    public EsriClient() {
        this.webClient = WebClient.builder()
                .baseUrl(GITHUB_API_BASE_URL)
                .exchangeStrategies(ExchangeStrategies.builder().codecs(this::acceptedCodecs).build())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, GITHUB_V3_MIME_TYPE)
                .defaultHeader(HttpHeaders.USER_AGENT, USER_AGENT)
                .filter(logRequest())
                .build();
    }

    private void acceptedCodecs(ClientCodecConfigurer clientCodecConfigurer) {
        clientCodecConfigurer.customCodecs().encoder(new Jackson2JsonEncoder(new ObjectMapper(), TEXT_PLAIN));
        clientCodecConfigurer.customCodecs().decoder(new Jackson2JsonDecoder(new ObjectMapper(), TEXT_PLAIN));
    }

    public Flux<Root> listEsriQuery() {
        return webClient.get()
                .uri("/query?where=1=1&objectIds=&time=&geometry=&geometryType=esriGeometryEnvelope&inSR=&spatialRel=esriSpatialRelIntersects&resultType=none&distance=0.0&units=esriSRUnit_Meter&returnGeodetic=false&outFields=*&returnGeometry=true&featureEncoding=esriDefault&multipatchOption=xyFootprint&maxAllowableOffset=&geometryPrecision=&outSR=4326&datumTransformation=&applyVCSProjection=false&returnIdsOnly=false&returnUniqueIdsOnly=false&returnCountOnly=false&returnExtentOnly=false&returnQueryGeometry=false&returnDistinctValues=false&cacheHint=false&orderByFields=&groupByFieldsForStatistics=&outStatistics=&having=&resultOffset=&resultRecordCount=10&returnZ=false&returnM=false&returnExceededLimitFeatures=true&quantizationParameters=&sqlFormat=none&f=pjson&token=")
                .exchange()
                .flatMapMany(clientResponse -> clientResponse.bodyToFlux(Root.class));
    }


    private ExchangeFilterFunction logRequest() {
        return (clientRequest, next) -> {
            logger.info("Request: {} {}", clientRequest.method(), clientRequest.url());
            clientRequest.headers()
                    .forEach((name, values) -> values.forEach(value -> logger.info("{}={}", name, value)));
            return next.exchange(clientRequest);
        };
    }
}
