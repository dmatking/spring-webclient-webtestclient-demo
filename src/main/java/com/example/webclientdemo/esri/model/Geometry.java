package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
    @JsonProperty("x")
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double x;

    @JsonProperty("y")
    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double y;
}
