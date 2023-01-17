package RentalShop;

public class RentalShop {

    private Cars cars;
    private String name;

    public RentalShop(String name) {
        this.name = name;
    }

    public int getCar() {
        return cars.BMW.getReference();
    }
}
