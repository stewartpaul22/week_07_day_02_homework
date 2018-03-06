import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    private Ride ride;

    @Before
    public void setUp() throws Exception {
        ride = new Ride("Nemesis", 10.00, 20, 8, 120);
    }

    @Test
    public void hasName() {
        assertEquals("Nemesis", ride.getName());
    }
}
