package edu.monilgudhka.rental;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class Station {
    private String stationId;
    private Address address;
    private int totalParkingSlots;

    private List<Parking> parkingList;

    public List<Parking> getAvailableParking() {
        return parkingList.stream()
                .filter(parking -> !parking.isBikeParked())
                .collect(Collectors.toList());
    }
}
