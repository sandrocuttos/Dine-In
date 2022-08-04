package com.project.dinein.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishId;

    private String name;

    private Blob image;

    private int price;

    private String type;

    private String description;

    public Dish() {
    }

    public Dish(int dishId, String name, Blob image, int price, String type, String description) {
        this.dishId = dishId;
        this.name = name;
        this.image = image;
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public Dish(String name, Blob image, int price, String type, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDishId() {
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

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", name='" + name + '\'' +
                ", image=" + image +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
