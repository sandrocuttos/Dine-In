package com.project.dinein.model;

import java.sql.Blob;
import java.util.UUID;

public class Dish {

    private final UUID dishId;

    private final String name;

    private final Blob image;

    private final int price;

    private String type;

    public Dish(UUID dishId, String name, Blob image, int price, String type) {
        this.dishId = dishId;
        this.name = name;
        this.image = image;
        this.price = price;
        this.type = type;
    }

    public UUID getDishId() {
        return dishId;
    }

    public String getName() {
        return name;
    }

    public Blob getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
