package edu.monilgudhka.rental;

import lombok.Data;

@Data
public abstract class BikeDetails {

    private String modelNumber;
    private String color;
    private int capacity;

}
