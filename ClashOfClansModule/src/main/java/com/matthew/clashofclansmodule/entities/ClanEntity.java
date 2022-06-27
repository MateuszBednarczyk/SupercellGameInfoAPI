package com.matthew.clashofclansmodule.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "clans")
@Data
@Entity
public class ClanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("clanLevel")
    private Integer clanLevel;
    private LocalDateTime requestDate;

    public ClanEntity(String tag, String name, Integer clanLevel, LocalDateTime requestDate) {
        this.tag = tag;
        this.name = name;
        this.clanLevel = clanLevel;
        this.requestDate = requestDate;
    }

    public ClanEntity() {

    }
}
