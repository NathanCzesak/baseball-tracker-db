package com.practice.baseballtrackerdb;

import jakarta.persistence.*;

//Entity Tells JPA that this class maps to a database
@Entity
//Table names the table in the database
@Table(name = "baseball_player")
public class BaseballPlayer {
    //Id is the primary key
    @Id
    //GeneratedValue auto generates an ID for each player
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private String position;
    private double batAvg;

    public BaseballPlayer() {}

    public BaseballPlayer(String name, String team, String position, double batAvg) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.batAvg = batAvg;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public double getBatAvg() {
        return batAvg;
    }
    public void setBatAvg(double batAvg) {
        this.batAvg = batAvg;
    }
}
