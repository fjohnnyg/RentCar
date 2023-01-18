package ClassRentalShop;

public class Client {

    private int clientID;
    private RentShop rentShop;

    private Vehicle rentedVehicle;

    public Client(int clientID, RentShop rentShop) {
        this.clientID = clientID;
        this.rentShop = rentShop;
    }

    public void askForVehicle() {
        rentShop.showVehicles();
    }

    public void rentVehicle(String vehicle) {
        this.rentedVehicle = rentShop.selectVehicle (vehicle);
    }

    public void travel(int distance, int time) {
        if (distance/rentedVehicle.getMaxSpeed() > time) {
            System.out.println("Sorry, you need a faster vehicle.");
            return;
        }
        if (rentedVehicle instanceof Motorcycle) {
            if (distance > 80)
                System.out.println("You need a car");
            return;
        }
        for (int i = 0; i < distance; i++) {
            rentedVehicle.setTankFuel();
            if (rentedVehicle.getTankFuel() < 1) {
                System.out.println("You ran out of gas, please refuel.");
                rentedVehicle.refuel(20);
                System.out.println("Refueled");
            }
        }
        System.out.println("You arrived at your destination, and have " + rentedVehicle.getTankFuel() + "l left on your fuel tank");
    }

    public void returnVehicle(Vehicle rentedVehicle) {
        rentShop.receiveVehicle(rentedVehicle);
    }

    public Vehicle getRentedVehicle() {
        return rentedVehicle;
    }
}
