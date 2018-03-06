public abstract class Ride {

    private String name;
    private double price;
    private int capacity;

    public Ride(String name, double price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCapacity() {
        return this.capacity;
    }


}
