package ClassRentalShop;

public class Main {

    public static void main(String[] args) {

        RentShop avis = new RentShop ("Avis");

        avis.addVehicle(new Cars("BMW X3",7));
        avis.addVehicle(new Cars("Fiat Panda",5));
        avis.addVehicle(new Cars("Opel Astra",6));
        avis.addVehicle(new Motorcycle("Honda",4));

        Client client = new Client(001, avis);

        Client manel = new Client(002, avis);

        client.askForVehicle(TypeOfVehicle.ALL);
        client.rentVehicle("Opel Astra");
    }



}
