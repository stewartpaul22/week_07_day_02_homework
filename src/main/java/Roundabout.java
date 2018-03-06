public class Roundabout extends Ride implements IStart, IStop {

    public Roundabout(String name, double price, int capacity) {
        super(name, price, capacity);
    }

    @Override
    public String start(String status) {
        return "Current status: " + status;
    }

    @Override
    public String stop(String status) {
        return "Current status: " + status;
    }
}
