public class Customer extends Person {

    private double funds;

    public Customer(String name, int age, int height, double funds) {
        super(name, age, height);
        this.funds = funds;
    }

    public double getFunds() {
        return this.funds;
    }
}
