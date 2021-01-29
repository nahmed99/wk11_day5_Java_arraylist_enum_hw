import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger57;
    private Passenger harryHill = new Passenger("Harry Hill", 3);


    @Test
    public void passengerHasName() {
        passenger57 = new Passenger("John Cutter", 2);
        assertEquals("John Cutter", passenger57.getName());
    }


}
