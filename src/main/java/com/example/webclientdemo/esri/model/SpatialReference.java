package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpatialReference {
    @JsonProperty("wkid")
    public int getWkid() {
        return this.wkid;
    }

    public void setWkid(int wkid) {
        this.wkid = wkid;
    }

    int wkid;

    @JsonProperty("latestWkid")
    public int getLatestWkid() {
        return this.latestWkid;
    }

    public void setLatestWkid(int latestWkid) {
        this.latestWkid = latestWkid;
    }

    int latestWkid;
}
