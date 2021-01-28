package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UniqueIdField {
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("isSystemMaintained")
    public boolean getIsSystemMaintained() {
        return this.isSystemMaintained;
    }

    public void setIsSystemMaintained(boolean isSystemMaintained) {
        this.isSystemMaintained = isSystemMaintained;
    }

    boolean isSystemMaintained;
}
