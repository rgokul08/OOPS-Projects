import java.util.*;
public class CarInventorySystem {
static Scanner sc = new Scanner(System.in);
static HashMap<String, Integer> carStock = new HashMap<>();
public static void main(String[] args) {
carStock.put("toyota", 10);
carStock.put("honda", 15);
carStock.put("hyundai", 8);
int choice;
do {
displayMenu();
choice = getValidInt("Enter choice: ");
switch (choice) {
case 1:
addCar();
break;
case 2:
sellCar();
break;
case 3:
restockCar();
break;
case 4:
showAllCars();
break;
case 5:
showLowStock();
break;
case 6:
System.out.println(" Exiting system...");
break;
default:
System.out.println(" Invalid choice");
}
} while (choice != 6);
}
static void displayMenu() {
System.out.println("===== CAR INVENTORY MENU =====");
System.out.println("1. Add New Car Type");
System.out.println("2. Sell Car");
System.out.println("3. Add Car Stock");
System.out.println("4. Show All Cars");
System.out.println("5. Show Low Stock Cars");
System.out.println("6. Exit");
}
static int getValidInt(String message) {
while (true) {
try {
System.out.print(message);
return sc.nextInt();
} catch (InputMismatchException e) {
System.out.println(" Please enter a valid number.");
sc.next(); // clear invalid input
}
}
}
static void addCar() {
sc.nextLine();
System.out.print("Enter car name: ");
String car = sc.nextLine().toLowerCase();
if (carStock.containsKey(car)) {
System.out.println("Car already exists. Use restock option.");
return;
}
int qty = getValidInt("Enter quantity: ");
carStock.put(car, qty);
System.out.println(" Car added successfully.");
}
static void sellCar() {
sc.nextLine();
System.out.print("Enter car name: ");
String car = sc.nextLine().toLowerCase();
if (!carStock.containsKey(car)) {
System.out.println("Car not found.");
return;
}
int sellQty = getValidInt("Enter quantity to sell: ");
int current = carStock.get(car);
if (sellQty <= current) {
carStock.put(car, current - sellQty);
System.out.println("Car sold successfully.");
} else {
System.out.println(" Not enough stock.");
}
}
static void restockCar() {
sc.nextLine();
System.out.print("Enter car name: ");
String car = sc.nextLine().toLowerCase();
if (!carStock.containsKey(car)) {
System.out.println(" Car not found.");
return;
}
int qty = getValidInt("Enter quantity to add: ");
carStock.put(car, carStock.get(car) + qty);
System.out.println(" Stock updated.");
}

static void showAllCars() {
System.out.println(" Car Inventory:");
if (carStock.isEmpty()) {
System.out.println("No cars available.");
return;
}
for (Map.Entry<String, Integer> entry : carStock.entrySet()) {
System.out.println(entry.getKey().toUpperCase() + " : " + entry.getValue());
}
}
static void showLowStock() {
System.out.println(" Low Stock Cars (<5):");
boolean found = false;
for (Map.Entry<String, Integer> entry : carStock.entrySet()) {
if (entry.getValue() < 5) {
System.out.println(entry.getKey().toUpperCase() + " : " + entry.getValue());
found = true;
}
}
if (!found) {
System.out.println("All cars have sufficient stock.");
}
}
}