public class Customer extends Person implements IBoard {

    private double funds;

    public Customer(String name, int age, int height, double funds) {
        super(name, age, height);
        this.funds = funds;
    }

    public double getFunds() {
        return this.funds;
    }

    @Override
    public String board(String ride) {
        return "Boarded: " + ride;
    }

    public String boardRide(Rollercoaster rollercoaster) {
        if (this.getHeight() < rollercoaster.getMinHeight()) {
            return "Cannot board " + rollercoaster.getName() + ": too short";
        } else if (this.getAge() < rollercoaster.getMinAge()) {
            return "Cannot board " + rollercoaster.getName() + ": too young";
        } else if (this.funds < rollercoaster.getPrice()) {
            return "Cannot board " + rollercoaster.getName() + ": not enough money";
        }
        return "Customer has boarded: " + rollercoaster.getName();
    }
}
