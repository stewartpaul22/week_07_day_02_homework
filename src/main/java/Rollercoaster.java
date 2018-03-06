public class Rollercoaster extends Ride implements IStart {

    private int minAge;
    private int minHeight;

    public Rollercoaster(String name, double price, int capacity, int minAge, int minHeight) {
        super(name, price, capacity);
        this.minAge = minAge;
        this.minHeight= minHeight;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    @Override
    public String start(String status) {
        return "Current status: " + status;
    }
}
