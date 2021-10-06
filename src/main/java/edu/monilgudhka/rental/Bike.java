package edu.monilgudhka.rental;

import lombok.Data;

@Data
public class Bike {

    private String bikeId;
    private BikeStatus bikeStatus;
    private BikeDetails bikeDetails;

}
