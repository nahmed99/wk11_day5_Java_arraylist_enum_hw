import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane airBusA320;

    // This method will be run before each testcase to reset/initialise the data.
    @Before
    public void before() {
        airBusA320 = new Plane(PlaneType.AIRBUSA320);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUSA320, airBusA320.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(180, airBusA320.getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(83_000, airBusA320.getTotalWeight());
    }

}
