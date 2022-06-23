package com.matthew.clashofclansmodule.Models;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "stars", "value", "target", "info", "completionInfo", "village"})
@Generated("jsonschema2pojo")
@Entity
@Table(name = "achievement")
public class Achievement {

    @JsonProperty("name")
    private String name;
    @JsonProperty("stars")
    private Integer stars;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("target")
    private Integer target;
    @JsonProperty("info")
    private String info;
    @JsonProperty("completionInfo")
    private String completionInfo;
    @JsonProperty("village")
    private String village;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("stars")
    public Integer getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("target")
    public Integer getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Integer target) {
        this.target = target;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonProperty("completionInfo")
    public String getCompletionInfo() {
        return completionInfo;
    }

    @JsonProperty("completionInfo")
    public void setCompletionInfo(String completionInfo) {
        this.completionInfo = completionInfo;
    }

    @JsonProperty("village")
    public String getVillage() {
        return village;
    }

    @JsonProperty("village")
    public void setVillage(String village) {
        this.village = village;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
