import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Passenger passenger57, harryHill;
    private Plane airBusA320, boeing747, cessnaA172;
    private Flight shortHop, shuttle, longHaul;
    private FlightManager flightManager;


    @Before
    public void before() {
        // Passengers
        passenger57 = new Passenger("John Cutter", 2);
        harryHill = new Passenger("Harry Hill", 1);

        // Planes
        airBusA320 = new Plane(PlaneType.AIRBUSA320);
        boeing747 = new Plane(PlaneType.BOEING747);
        cessnaA172 = new Plane(PlaneType.CESSNA172);

        // Flights
        shortHop = new Flight(cessnaA172,
                "CC133",
                AirportCode.GLA,
                AirportCode.ABZ,
                "10:35");

        shuttle = new Flight(airBusA320,
                "BM257",
                AirportCode.GLA,
                AirportCode.LHR,
                "06:15");

        longHaul = new Flight(boeing747,
                "TJ001",
                AirportCode.GLA,
                AirportCode.DXB,
                "13:00");

        // FlightManager
        flightManager = new FlightManager();
    }

    @Test
    public void canCalculateBaggageAllowance() {
        // Calculate the passenger baggage allowance on a Cessna...
        assertEquals(166, flightManager.calculateBaggageAllowance(shortHop));
    }

    @Test
    public void canCalculateTotalBaggageWeight() {
        // Calculate the total weight of passengers' baggage.

        shortHop.bookPassenger(passenger57); // passenger has two bags.
        assertEquals(332, flightManager.totalBaggageWeight(shortHop));
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        // Calculate the total weight of passengers' baggage.

        shortHop.bookPassenger(passenger57); // passenger has two bags.
        assertEquals(166, flightManager.remainingBaggageWeight(shortHop));
    }

}
