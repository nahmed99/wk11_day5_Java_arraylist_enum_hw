import org.junit.Before;
import org.junit.Test;

public class FlightTest {

    private Passenger passenger57, harryHill;
    private Plane airBusA320, boeing747, cessnaA172;
    private Flight shortHop, shuttle, longHaul;


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
    }

    @Test
    public void canGetNumberOfAvailableSeats() {
        
    }


}
