package com.matthew.clashofclansmodule.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "players")
@Entity
@Data
public class PlayerEntity {

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
    @Nullable
    private String clanName;

    private LocalDateTime requestDate;

    public PlayerEntity(String tag, String name, Integer townHallLevel, Integer expLevel, Integer trophies, Integer bestTrophies, Integer warStars, Integer attackWins, Integer defenseWins, Integer builderHallLevel, Integer versusTrophies, Integer bestVersusTrophies, Integer versusBattleWins, String role, String warPreference, Integer donations, Integer donationsReceived, LocalDateTime requestDate) {
        this.tag = tag;
        this.name = name;
        this.townHallLevel = townHallLevel;
        this.expLevel = expLevel;
        this.trophies = trophies;
        this.bestTrophies = bestTrophies;
        this.warStars = warStars;
        this.attackWins = attackWins;
        this.defenseWins = defenseWins;
        this.builderHallLevel = builderHallLevel;
        this.versusTrophies = versusTrophies;
        this.bestVersusTrophies = bestVersusTrophies;
        this.versusBattleWins = versusBattleWins;
        this.role = role;
        this.warPreference = warPreference;
        this.donations = donations;
        this.donationsReceived = donationsReceived;
        this.requestDate = requestDate;
    }

    public PlayerEntity() {

    }
}
