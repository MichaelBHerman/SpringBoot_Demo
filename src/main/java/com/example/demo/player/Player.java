package com.example.demo.player;

public class Player {
    private Long id;
    private String name;
    private String team;
    private int ppg;
    private int age;

    //no arg constructor
    public Player() {
    }
    //all args constructor
    public Player(Long id, String name, String team, int ppg, int age) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.ppg = ppg;
        this.age = age;
    }

    //constructor without id because the database will generate the id for us
    public Player(String name, String team, int ppg, int age) {
        this.name = name;
        this.team = team;
        this.ppg = ppg;
        this.age = age;
    }

    //getters and setters

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

    public int getPpg() {
        return ppg;
    }

    public void setPpg(int ppg) {
        this.ppg = ppg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString method

    @Override
    public String toString() {
        return "player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", ppg=" + ppg +
                ", age=" + age +
                '}';
    }
}
