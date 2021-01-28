package com.example.webclientdemo;

import com.example.webclientdemo.esri.model.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;

/**
 * Created by rajeevkumarsingh on 11/11/17.
 * Modified DMK 1/27/2021
 */
@RestController
@RequestMapping("/esri")
public class EsriController {

    @Autowired
    private EsriClient esriClient;

    private static final Logger logger = LoggerFactory.getLogger(EsriController.class);

    @GetMapping("/repos")
    public Flux<Root> listEsriQuery() {
        return esriClient.listEsriQuery();
    }

    @ExceptionHandler(WebClientResponseException.class)
    public ResponseEntity<String> handleWebClientResponseException(WebClientResponseException ex) {
        logger.error("Error from WebClient - Status {}, Body {}", ex.getRawStatusCode(),
                ex.getResponseBodyAsString(), ex);
        return ResponseEntity.status(ex.getRawStatusCode()).body(ex.getResponseBodyAsString());
    }
}
