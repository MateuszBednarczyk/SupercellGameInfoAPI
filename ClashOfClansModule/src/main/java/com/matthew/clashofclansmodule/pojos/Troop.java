package com.matthew.clashofclansmodule.pojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "level", "maxLevel", "village"})
@Generated("jsonschema2pojo")
public class Troop {

    @JsonProperty("name")
    private String name;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("maxLevel")
    private Integer maxLevel;
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

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("maxLevel")
    public Integer getMaxLevel() {
        return maxLevel;
    }

    @JsonProperty("maxLevel")
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
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
