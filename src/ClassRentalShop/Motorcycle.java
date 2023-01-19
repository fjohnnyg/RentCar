package ClassRentalShop;

public class Motorcycle extends Vehicle {

    private static final int MAX_SPEED = 100;
    private static final TypeOfVehicle MOTORCYCLE = TypeOfVehicle.MOTORCYCLE;

    public Motorcycle(String modelName, double gasConsumption) {
        super(modelName, gasConsumption, MAX_SPEED, MOTORCYCLE);
    }
}
