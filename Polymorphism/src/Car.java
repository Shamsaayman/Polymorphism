public class Car implements Vehicle{
    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }
    @Override
    public double calculateRentalCost() {
        return 50 * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Rental Days: " + days);
        System.out.println("Daily Rental Rate: $50.0  " );
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
