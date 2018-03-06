import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    private Staff staff;

    @Before
    public void setUp() throws Exception {
        staff = new Staff("Bill", 35, 180);
    }

    @Test
    public void hasName() {
        assertEquals("Bill", staff.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(35, staff.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(180, staff.getHeight());
    }
}
