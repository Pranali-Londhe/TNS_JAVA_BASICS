
import java.util.ArrayList;
import java.util.List;

public class RentalShop {

    private List<Vehicle> fleet;
    private List<Rental> activeRentals;

    public RentalShop() {
        fleet = new ArrayList<>();
        activeRentals = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(Vehicle vehicle, Customer customer, int days) {

        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be positive"
            );
        }

        Vehicle found = null;

        for (Vehicle v : fleet) {
            if (v.getId() == vehicle.getId()) {
                found = v;
                break;
            }
        }

        if (found == null) {
            throw new IllegalArgumentException(
                    "Vehicle not found in the shop"
            );
        }

        if (!found.isAvailable()) {
            throw new IllegalStateException(
                    "Vehicle is already rented"
            );
        }

        Rental rental = new Rental(found, customer, days);

        found.setAvailable(false);
        activeRentals.add(rental);
        customer.addRental(rental);

        return rental;
    }

    public void giveBack(int vehicleId) {

        Rental foundRental = null;

        for (Rental rental : activeRentals) {
            if (rental.getVehicle().getId() == vehicleId) {
                foundRental = rental;
                break;
            }
        }

        if (foundRental == null) {
            throw new IllegalArgumentException(
                    "No active rental found for this vehicle"
            );
        }

        foundRental.getVehicle().setAvailable(true);
        activeRentals.remove(foundRental);

        System.out.println("Vehicle returned successfully!");
    }

    public void showAvailable() {

        boolean found = false;

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println(
                        "ID: " + vehicle.getId()
                                + ", Model: " + vehicle.getModel()
                                + ", Daily Rate: ₹" + vehicle.getDailyRate()
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles available.");
        }
    }
}
