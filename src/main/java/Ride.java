public class Ride {

    private String name;
    private double price;
    private int capacity;
    private int minAge;
    private int minHeight;

    public Ride(String name, double price, int capacity, int minAge, int minHeight) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName() {
        return this.name;
    }
}
