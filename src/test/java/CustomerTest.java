import org.junit.Before;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Angela", 7, 130, 20.00);
    }

    
}
