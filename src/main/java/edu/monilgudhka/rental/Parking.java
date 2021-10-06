package edu.monilgudhka.rental;

import lombok.Data;

import java.util.Optional;

@Data
public class Parking {
    private String parkingId;
    private Station station;
    private Optional<Bike> parkedBike;

    /*
        If there is already a bike parked in this Parking
        then throw Exception
        else park the booked bike
     */
    public void parkBike(Bike bikeToPark) {
        if(parkedBike.isPresent()) {
           throw new RuntimeException();
        }
        parkedBike = Optional.ofNullable(bikeToPark);
    }

    public Bike unParkBike() {
        Bike bike = parkedBike.orElseThrow(RuntimeException::new);
        parkedBike = Optional.empty();
        return bike;
    }

    // TODO: Availability based on bike type
}
