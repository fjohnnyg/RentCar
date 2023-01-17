package week3.rentCar;

public enum Cars {

    BMW (6, 001, "X3"),
    FIAT (5, 002, "Panda"),
    OPEL(4, 003, "Astra");

    private final int fuelTank = 25;
    private int consumption;
    private final int maxSpeed = 120;
    private int reference;
    private String model;

    private Cars(int consumption, int reference, String model) {
        this.consumption = consumption;
        this.reference = reference;
        this.model = model;
    }


}
