public class Roundabout extends Ride implements IStart {

    public Roundabout(String name, double price, int capacity) {
        super(name, price, capacity);
    }

    @Override
    public String start(String status) {
        return "Current status: " + status;
    }
}
