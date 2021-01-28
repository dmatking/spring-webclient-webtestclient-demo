package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {
    @JsonProperty("OBJECTID")
    public int getOBJECTID() {
        return this.oBJECTID;
    }

    public void setOBJECTID(int oBJECTID) {
        this.oBJECTID = oBJECTID;
    }

    int oBJECTID;

    @JsonProperty("latitude")
    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    double latitude;

    @JsonProperty("longitude")
    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    double longitude;

    @JsonProperty("satellite")
    public String getSatellite() {
        return this.satellite;
    }

    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }

    String satellite;

    @JsonProperty("confidence")
    public String getConfidence() {
        return this.confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    String confidence;

    @JsonProperty("frp")
    public double getFrp() {
        return this.frp;
    }

    public void setFrp(double frp) {
        this.frp = frp;
    }

    double frp;

    @JsonProperty("daynight")
    public String getDaynight() {
        return this.daynight;
    }

    public void setDaynight(String daynight) {
        this.daynight = daynight;
    }

    String daynight;

    @JsonProperty("esritimeutc")
    public Object getEsritimeutc() {
        return this.esritimeutc;
    }

    public void setEsritimeutc(Object esritimeutc) {
        this.esritimeutc = esritimeutc;
    }

    Object esritimeutc;
}
