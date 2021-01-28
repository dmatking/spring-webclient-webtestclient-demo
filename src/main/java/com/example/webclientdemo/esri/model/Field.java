package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Field {
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("alias")
    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    String alias;

    @JsonProperty("sqlType")
    public String getSqlType() {
        return this.sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    String sqlType;

    @JsonProperty("domain")
    public Object getDomain() {
        return this.domain;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    Object domain;

    @JsonProperty("defaultValue")
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    Object defaultValue;

    @JsonProperty("length")
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int length;
}
