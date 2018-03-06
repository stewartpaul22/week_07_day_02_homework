import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Nemesis", 10.00, 20, 10, 120);
    }

    @Test
    public void hasName() {
        assertEquals("Nemesis", rollercoaster.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(10.00, rollercoaster.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, rollercoaster.getCapacity());
    }

    @Test
    public void hasMinAge() {
        assertEquals(10, rollercoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(120, rollercoaster.getMinHeight());
    }

    @Test
    public void canStart() {
        assertEquals("Current status: Running", rollercoaster.start("Running"));
    }
}
