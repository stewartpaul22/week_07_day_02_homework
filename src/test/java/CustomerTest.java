import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;
    private Customer customer4;
    private Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("Angela", 11, 110, 20.00);
        customer2 = new Customer("Davie", 7, 130, 10.00);
        customer3 = new Customer("Patricia", 18, 150, 5.00);
        customer4 = new Customer("Joseph", 25, 190, 50.00);
        rollercoaster = new Rollercoaster("Nemesis", 10.00, 20, 10, 120);
    }

    @Test
    public void hasName() {
        assertEquals("Angela", customer1.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(11, customer1.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(110, customer1.getHeight());
    }

    @Test
    public void hasFunds() {
        assertEquals(20.00, customer1.getFunds(), 0.01);
    }

    @Test
    public void canBoard() {
        assertEquals("Boarded: Nemesis", customer1.board(rollercoaster.getName()));
    }

    @Test
    public void canBoardRollercoaster() {
        assertEquals("Customer has boarded: Nemesis", customer4.boardRide(rollercoaster));
    }

    @Test
    public void cannotBoard__TooShort() {
        assertEquals("Cannot board Nemesis: too short", customer1.boardRide(rollercoaster));
    }

    @Test
    public void cannotBoard__TooYoung() {
        assertEquals("Cannot board Nemesis: too young", customer2.boardRide(rollercoaster));
    }

    // test if not enough money

}
