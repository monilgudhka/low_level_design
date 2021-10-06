package edu.monilgudhka.rental;

import lombok.Data;

@Data
public class Booking {

    private String bookingId;
    private User user;
    private Bike bike;
    private Parking sourceParking;
    private BookingStatus bookingStatus;
    private Parking destinationParking;

//    private ActivityHistory activityHistory;
}

/*
    BookingService

    POST /api/v1/rental/bookings/book
    Authenticate: authToken (extract userId from here)
    Request Body: {
        "bikeId": bikeId,
        "sourceParkingId": parkingId
    }
    Response Body: {
        "bookingId": bookingId
    }
    Booking book(User user, Bike bike, Parking parking)
        1. Validations
        2. update Booking Information
        3. Parking unPark
        4. update Bike status

    POST /api/v1/rental/bookings/finish
    Authenticate: authToken (extract userId from here)
    Request Body: {
        "bookingId": bookingId,
        "destinationParking": parkingId
    }
    Response Body: {
        "pricing": pricing
    }
    void finish(Booking booking, Parking parking)
        1. Validations
        2. Pricing
        3. Parking parkBike
        4. update Booking information (activity, destination=Parking, status=FINISH)
        5. update Bike status


 */
