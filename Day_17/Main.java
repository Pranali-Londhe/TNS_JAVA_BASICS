
public class Main {

    public static void main(String[] args) {

        RentalShop shop = new RentalShop();

        Vehicle car = new Car(1, "Hyundai", 2000);
        Vehicle bike = new Bike(2, "Honda", 500);
        Vehicle truck = new Truck(3, "Tata", 3000);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer customer = new Customer(101, "Pranali");

        System.out.println("AVAILABLE VEHICLES");
        shop.showAvailable();

        try {
            Rental rental = shop.rent(bike, customer, 7);

            System.out.println("\nRENTAL DETAILS");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Vehicle: " + rental.getVehicle().getModel());
            System.out.println("Days: " + rental.getDays());
            System.out.println("Total Rent: ₹" + rental.getTotalRent());

            System.out.println("\nVEHICLES AFTER RENTING");
            shop.showAvailable();

            shop.giveBack(2);

            System.out.println("\nVEHICLES AFTER RETURN");
            shop.showAvailable();

            System.out.println(
                    "\nCustomer Rental History: "
                            + customer.getRentalHistory().size()
                            + " rental(s)"
            );

        } catch (IllegalArgumentException |
                 IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
