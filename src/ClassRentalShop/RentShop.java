package ClassRentalShop;

public class RentShop {

    private String name;

    private Vehicle[] vehicles;

    private int numOfVehicles;
    private double minFuelForReturnedVehicle = 20;
    private double penaltyFee = 2.5;


    public RentShop(String name) {
        this.name = name;
        this.vehicles = new Vehicle[20];
    }


    public void addVehicle (Vehicle v) {
        if (numOfVehicles < vehicles.length) {
            vehicles[numOfVehicles++] = v;
        }
        else {
            System.out.println("Reached limit of 20, create a new array if you want!");
        }
    }

    public void showVehicles() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null)
                return;
            if (vehicles[i].isAvailable()) {
                System.out.println(vehicles[i].toString());
            }
        }
    }

    public Vehicle selectVehicle(String vehicle) {
        Vehicle selectedVehicle = null;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null)
                break;
            if (vehicles[i].getModelName() == vehicle) {
                if (vehicles[i].isAvailable()) {
                    selectedVehicle = vehicles[i];
                    vehicles[i].setAvailable(false);
                    System.out.println("There you have your " + vehicles[i].getModelName());
                } else System.out.println("That vehicle is not available");
            }
        }
        return selectedVehicle;
    }

    public void receiveVehicle(Vehicle rentedVehicle){
        if (rentedVehicle == null) {
            System.out.println("Sorry. You have never rented a vehicle with us");
            return;
        }
        if (rentedVehicle.getTankFuel() < minFuelForReturnedVehicle) {
            double penaltyCharge = (minFuelForReturnedVehicle - rentedVehicle.getTankFuel()) * penaltyFee;
            System.out.println( "Additional charge of" + penaltyCharge + " euros for missing fuel.");
        }
        System.out.println("Thank you for returning the vehicle with " + rentedVehicle.getTankFuel() + "l of fuel");
        rentedVehicle.setAvailable(true);
    }
}
