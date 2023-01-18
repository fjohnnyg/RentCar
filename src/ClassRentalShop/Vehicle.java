package ClassRentalShop;

public abstract class Vehicle {

    private boolean isAvailable;
    private String modelName;
    private double gasConsumption;
    private int maxSpeed;
    private double tankFuel = 25;

    public Vehicle(String modelName, double gasConsumption, int maxSpeed) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.maxSpeed = maxSpeed;
        this.isAvailable = true;
    }

    public double refuel(double gasAmount){
        return this.tankFuel += gasAmount;
    }

    private double spendFuel() {
        return tankFuel - (gasConsumption / 100);
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getTankFuel() {
        return tankFuel;
    }

    public void setTankFuel() {
        this.tankFuel = spendFuel();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", gasConsumption=" + gasConsumption +
                ", maxSpeed=" + maxSpeed +
                ", tankFuel=" + tankFuel +
                '}';
    }



}
