import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
System.out.println("Vehicle Rental System");
System.out.println("---------------------");
        while (true) {
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = s.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int carDays = s.nextInt();
                    rentedVehicles.add(new Car(carModel, carDays));
                    System.out.println("Rental Details:");
                    System.out.println("---------------------");
                    rentedVehicles.get(rentedVehicles.size() - 1).displayDetails();
                    break;

                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = s.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int bikeHours = s.nextInt();
                    rentedVehicles.add(new Bike(bikeBrand, bikeHours));
                    System.out.println("Rental Details:");
                    System.out.println("---------------------");
                    rentedVehicles.get(rentedVehicles.size() - 1).displayDetails();
                    break;

                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = s.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int truckWeeks = s.nextInt();
                    rentedVehicles.add(new Truck(truckType, truckWeeks));
                    System.out.println("Rental Details:");
                    System.out.println("---------------------");
                    rentedVehicles.get(rentedVehicles.size() - 1).displayDetails();
                    break;

                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                        System.out.println("------------------------------");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}