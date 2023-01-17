package RentalShop;

public class Client {

    private int clientId;

    private RentalShop rentalShop;
    private int car;




    public Client() {

    }

    public void setRentalShop(RentalShop rentalShop){
        this.rentalShop = rentalShop;
    }

    public void askForCar() {
        rentalShop.getCar();
        this.car = rentalShop.getCar();
    }

    public int getCar() {
        return car;
    }
}
