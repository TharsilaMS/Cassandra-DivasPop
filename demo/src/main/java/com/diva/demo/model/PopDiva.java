package com.diva.demo.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.Column;

import java.util.UUID;

@Table("pop_divas")
public class PopDiva {

    @PrimaryKey
    private UUID divaId;

    @Column("name")
    private String name;

    @Column("debut_year")
    private int debutYear;

    @Column("genre")
    private String genre;


    public PopDiva() {}

    public PopDiva(UUID divaId, String name, int debutYear, String genre) {
        this.divaId = divaId;
        this.name = name;
        this.debutYear = debutYear;
        this.genre = genre;
    }


    public UUID getDivaId() {
        return divaId;
    }

    public void setDivaId(UUID divaId) {
        this.divaId = divaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
