
public class Bike extends Vehicle {

    public Bike(int id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = dailyRate * days;

        if (days >= 7) {
            rent = rent - (rent * 0.10);
        }

        return rent;
    }
}
