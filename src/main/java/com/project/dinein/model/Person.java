package com.project.dinein.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(@JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }



}
