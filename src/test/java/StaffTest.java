import org.junit.Before;

public class StaffTest {

    private Staff staff;

    @Before
    public void setUp() throws Exception {
        staff = new Staff("Bill", 35, 180);
    }
}
