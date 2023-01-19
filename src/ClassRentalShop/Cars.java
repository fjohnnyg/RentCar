package ClassRentalShop;

public class Cars extends Vehicle {
   // private enum CAR;
    private static final int MAX_SPEED= 120;

    private static final TypeOfVehicle CAR = TypeOfVehicle.CAR;

    public Cars(String modelName, double gasConsumption) {
        super(modelName, gasConsumption, MAX_SPEED, TypeOfVehicle.CAR);
    }


}
