package com.matthew.clashofclansmodule.pojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"tag", "name", "townHallLevel", "expLevel", "trophies", "bestTrophies", "warStars", "attackWins", "defenseWins", "builderHallLevel", "versusTrophies", "bestVersusTrophies", "versusBattleWins", "role", "warPreference", "donations", "donationsReceived", "clan", "achievements", "versusBattleWinCount", "labels", "troops", "heroes", "spells"})
@Generated("jsonschema2pojo")
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("townHallLevel")
    private Integer townHallLevel;
    @JsonProperty("expLevel")
    private Integer expLevel;
    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("bestTrophies")
    private Integer bestTrophies;
    @JsonProperty("warStars")
    private Integer warStars;
    @JsonProperty("attackWins")
    private Integer attackWins;
    @JsonProperty("defenseWins")
    private Integer defenseWins;
    @JsonProperty("builderHallLevel")
    private Integer builderHallLevel;
    @JsonProperty("versusTrophies")
    private Integer versusTrophies;
    @JsonProperty("bestVersusTrophies")
    private Integer bestVersusTrophies;
    @JsonProperty("versusBattleWins")
    private Integer versusBattleWins;
    @JsonProperty("role")
    private String role;
    @JsonProperty("warPreference")
    private String warPreference;
    @JsonProperty("donations")
    private Integer donations;
    @JsonProperty("donationsReceived")
    private Integer donationsReceived;
    @JsonProperty("clan")
    private Clan clan;
    @JsonProperty("achievements")
    private List<Achievement> achievements = null;
    @JsonProperty("versusBattleWinCount")
    private Integer versusBattleWinCount;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("troops")
    private List<Troop> troops = null;
    @JsonProperty("heroes")
    private List<Hero> heroes = null;
    @JsonProperty("spells")
    private List<Spell> spells = null;
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

    @JsonProperty("townHallLevel")
    public Integer getTownHallLevel() {
        return townHallLevel;
    }

    @JsonProperty("townHallLevel")
    public void setTownHallLevel(Integer townHallLevel) {
        this.townHallLevel = townHallLevel;
    }

    @JsonProperty("expLevel")
    public Integer getExpLevel() {
        return expLevel;
    }

    @JsonProperty("expLevel")
    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

    @JsonProperty("trophies")
    public Integer getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("bestTrophies")
    public Integer getBestTrophies() {
        return bestTrophies;
    }

    @JsonProperty("bestTrophies")
    public void setBestTrophies(Integer bestTrophies) {
        this.bestTrophies = bestTrophies;
    }

    @JsonProperty("warStars")
    public Integer getWarStars() {
        return warStars;
    }

    @JsonProperty("warStars")
    public void setWarStars(Integer warStars) {
        this.warStars = warStars;
    }

    @JsonProperty("attackWins")
    public Integer getAttackWins() {
        return attackWins;
    }

    @JsonProperty("attackWins")
    public void setAttackWins(Integer attackWins) {
        this.attackWins = attackWins;
    }

    @JsonProperty("defenseWins")
    public Integer getDefenseWins() {
        return defenseWins;
    }

    @JsonProperty("defenseWins")
    public void setDefenseWins(Integer defenseWins) {
        this.defenseWins = defenseWins;
    }

    @JsonProperty("builderHallLevel")
    public Integer getBuilderHallLevel() {
        return builderHallLevel;
    }

    @JsonProperty("builderHallLevel")
    public void setBuilderHallLevel(Integer builderHallLevel) {
        this.builderHallLevel = builderHallLevel;
    }

    @JsonProperty("versusTrophies")
    public Integer getVersusTrophies() {
        return versusTrophies;
    }

    @JsonProperty("versusTrophies")
    public void setVersusTrophies(Integer versusTrophies) {
        this.versusTrophies = versusTrophies;
    }

    @JsonProperty("bestVersusTrophies")
    public Integer getBestVersusTrophies() {
        return bestVersusTrophies;
    }

    @JsonProperty("bestVersusTrophies")
    public void setBestVersusTrophies(Integer bestVersusTrophies) {
        this.bestVersusTrophies = bestVersusTrophies;
    }

    @JsonProperty("versusBattleWins")
    public Integer getVersusBattleWins() {
        return versusBattleWins;
    }

    @JsonProperty("versusBattleWins")
    public void setVersusBattleWins(Integer versusBattleWins) {
        this.versusBattleWins = versusBattleWins;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("warPreference")
    public String getWarPreference() {
        return warPreference;
    }

    @JsonProperty("warPreference")
    public void setWarPreference(String warPreference) {
        this.warPreference = warPreference;
    }

    @JsonProperty("donations")
    public Integer getDonations() {
        return donations;
    }

    @JsonProperty("donations")
    public void setDonations(Integer donations) {
        this.donations = donations;
    }

    @JsonProperty("donationsReceived")
    public Integer getDonationsReceived() {
        return donationsReceived;
    }

    @JsonProperty("donationsReceived")
    public void setDonationsReceived(Integer donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    @JsonProperty("clan")
    public Clan getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @JsonProperty("achievements")
    public List<Achievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("versusBattleWinCount")
    public Integer getVersusBattleWinCount() {
        return versusBattleWinCount;
    }

    @JsonProperty("versusBattleWinCount")
    public void setVersusBattleWinCount(Integer versusBattleWinCount) {
        this.versusBattleWinCount = versusBattleWinCount;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("troops")
    public List<Troop> getTroops() {
        return troops;
    }

    @JsonProperty("troops")
    public void setTroops(List<Troop> troops) {
        this.troops = troops;
    }

    @JsonProperty("heroes")
    public List<Hero> getHeroes() {
        return heroes;
    }

    @JsonProperty("heroes")
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    @JsonProperty("spells")
    public List<Spell> getSpells() {
        return spells;
    }

    @JsonProperty("spells")
    public void setSpells(List<Spell> spells) {
        this.spells = spells;
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
