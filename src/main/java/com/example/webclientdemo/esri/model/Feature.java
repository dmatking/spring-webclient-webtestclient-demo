package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feature {
    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    Attributes attributes;

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return this.geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    Geometry geometry;
}
