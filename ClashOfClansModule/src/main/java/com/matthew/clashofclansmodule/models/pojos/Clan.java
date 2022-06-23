package com.matthew.clashofclansmodule.models.pojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"tag", "name", "clanLevel", "badgeUrls"})
@Generated("jsonschema2pojo")
public class Clan {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("clanLevel")
    private Integer clanLevel;
    @JsonProperty("badgeUrls")
    private BadgeUrls badgeUrls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("clanLevel")
    public Integer getClanLevel() {
        return clanLevel;
    }

    @JsonProperty("clanLevel")
    public void setClanLevel(Integer clanLevel) {
        this.clanLevel = clanLevel;
    }

    @JsonProperty("badgeUrls")
    public BadgeUrls getBadgeUrls() {
        return badgeUrls;
    }

    @JsonProperty("badgeUrls")
    public void setBadgeUrls(BadgeUrls badgeUrls) {
        this.badgeUrls = badgeUrls;
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
