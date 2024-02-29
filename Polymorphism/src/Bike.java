public class Bike implements Vehicle{
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return 10 * hours;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Rental Hours: " + hours);
        System.out.println("Daily Rental Rate: $10.0  " );
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
