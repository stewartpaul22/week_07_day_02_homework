import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Angela", 7, 130, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Angela", customer.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(7, customer.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(130, customer.getHeight());
    }

    @Test
    public void hasFunds() {
        assertEquals(20.00, customer.getFunds(), 0.01);
    }
}
