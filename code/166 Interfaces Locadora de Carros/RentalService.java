
import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24.0) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}