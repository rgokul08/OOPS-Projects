import java.util.*;

class FoodDelivery {
    void trackOrder(int orderId) {
        System.out.println("\n----- ORDER DETAILS---------");
        System.out.println("Order ID : " + orderId);
        System.out.println("Status : Out for Delivery");
        System.out.println("Delivery Partner: Rahul");
        System.out.println("Estimated Time : 25 minutes");
        System.out.println("----------------------------- ");
    }

void trackOrder(String customerName) { System.out.println("\n----- CUSTOMER DETAILS------------------------------------------ ");
System.out.println("Customer Name : " + customerName);
System.out.println("Active Orders : 2"); 
System.out.println("Latest Order :Preparing Food"); 
System.out.println("Estimated Time : 40 minutes");
System.out.println("--------------------------------- ");
}

    void trackOrder(String customerName, String restaurantName) {
        System.out.println("\n----- ORDER STATUS-------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Restaurant : " + restaurantName);
        System.out.println("Order Status : Ready for Pickup");
        System.out.println("Pickup Time : 10 minutes");
        System.out.println(" ");
    }

    void trackOrder(int orderId, long mobileNumber) {
        System.out.println("\n----- VERIFICATION DETAILS----------------------------------------- ");
        System.out.println("Order ID : " + orderId);
        System.out.println("Registered Mobile: " + mobileNumber);
        System.out.println("Status : Delivered Successfully");
        System.out.println("Delivered At : 7:45 PM");
        System.out.println(" ");
    }
}

public class Polymer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodDelivery fd = new FoodDelivery();
        int choice;
        System.out.println(" Welcome to Smart Food Tracker ");
        do {
            System.out.println("\nSelect Tracking Option:");
            System.out.println("1. Track by Order ID");
            System.out.println("2. Track by Customer Name");
            System.out.println("3. Track by Customer Name and Restaurant Name");
            System.out.println("4. Track byOrder ID and Mobile Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Order ID: ");
                    int orderId = sc.nextInt();
                    fd.trackOrder(orderId);
                    break;
                case 2:
                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();
                    fd.trackOrder(customerName);
                    break;
                case 3:
                    System.out.print("Enter Customer Name: ");
                    String custName = sc.nextLine();
                    System.out.print("Enter Restaurant Name: ");
                    String restaurantName = sc.nextLine();
                    fd.trackOrder(custName, restaurantName);
                    break;
                case 4:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Mobile Number: ");
                    long mobile = sc.nextLong();
                    fd.trackOrder(id, mobile);
                    break;
                case 5:
                    System.out.println("Thank you for using Smart Food Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);
        sc.close();
    }
}