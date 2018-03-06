import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundaboutTest {

    private Roundabout roundabout;

    @Before
    public void setUp() throws Exception {
        roundabout = new Roundabout("TeaCups", 5.00, 12);
    }

    @Test
    public void hasName() {
        assertEquals("TeaCups", roundabout.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(5.00, roundabout.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity() {
        assertEquals(12, roundabout.getCapacity());
    }

}
