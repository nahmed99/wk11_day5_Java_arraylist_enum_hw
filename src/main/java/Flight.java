import java.util.ArrayList;

public class Flight {

    // Instance variables
    private Plane plane;
    private String flightNumber;
    private AirportCode departureAirport, destinationAirport;
    private String departureTime;

    private ArrayList<Passenger> passengers;


    // Constructor
    public Flight(Plane plane,
                  String flightNumber,
                  AirportCode departureAirport,
                  AirportCode destinationAirport,
                  String departureTime) {

        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;

    }

    public int getSeatsAvailable() {
        return plane.getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

}
