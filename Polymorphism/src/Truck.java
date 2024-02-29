public class Truck implements Vehicle{
    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return 500 * weeks;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Rental Weeks: " + weeks);
        System.out.println("Daily Rental Rate: $500.0  " );
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
