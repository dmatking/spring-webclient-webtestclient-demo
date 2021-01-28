package com.example.webclientdemo.esri.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    @JsonProperty("objectIdFieldName")
    public String getObjectIdFieldName() {
        return this.objectIdFieldName;
    }

    public void setObjectIdFieldName(String objectIdFieldName) {
        this.objectIdFieldName = objectIdFieldName;
    }

    String objectIdFieldName;

    @JsonProperty("uniqueIdField")
    public UniqueIdField getUniqueIdField() {
        return this.uniqueIdField;
    }

    public void setUniqueIdField(UniqueIdField uniqueIdField) {
        this.uniqueIdField = uniqueIdField;
    }

    UniqueIdField uniqueIdField;

    @JsonProperty("globalIdFieldName")
    public String getGlobalIdFieldName() {
        return this.globalIdFieldName;
    }

    public void setGlobalIdFieldName(String globalIdFieldName) {
        this.globalIdFieldName = globalIdFieldName;
    }

    String globalIdFieldName;

    @JsonProperty("geometryType")
    public String getGeometryType() {
        return this.geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    String geometryType;

    @JsonProperty("spatialReference")
    public SpatialReference getSpatialReference() {
        return this.spatialReference;
    }

    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    SpatialReference spatialReference;

    @JsonProperty("fields")
    public List<Field> getFields() {
        return this.fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    List<Field> fields;

    @JsonProperty("exceededTransferLimit")
    public boolean getExceededTransferLimit() {
        return this.exceededTransferLimit;
    }

    public void setExceededTransferLimit(boolean exceededTransferLimit) {
        this.exceededTransferLimit = exceededTransferLimit;
    }

    boolean exceededTransferLimit;

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    List<Feature> features;
}
