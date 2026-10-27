
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int id;
    private String name;
    private List<Rental> rentalHistory;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentalHistory.add(rental);
    }

    public List<Rental> getRentalHistory() {
        return rentalHistory;
    }
}
