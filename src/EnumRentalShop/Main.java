package EnumRentalShop;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client();

        RentalShop avis = new RentalShop("AVIS");

        c1.setRentalShop(avis);

        c1.askForCar();

        System.out.println(c1.getCar());
    }
}
