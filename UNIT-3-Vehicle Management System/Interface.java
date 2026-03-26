import java.util.*;
interface Vehicle{
void start();
void stop();
void fuelCapacity();
void maxfuelCapacity();
void time();
}
class Car implements Vehicle{
public void start(){ System.out.println("Starting the car..."); }
public void stop(){ System.out.println("The car has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 50 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 60 liters."); }
public void time(){ System.out.println("Time per kilometer: 1 minute."); }
}
class Bike implements Vehicle{
public void start(){ System.out.println("Starting the bike..."); }
public void stop(){ System.out.println("The bike has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 15 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 20 liters."); }
public void time(){ System.out.println("Time per kilometer: 2 minutes."); }
}
class Truck implements Vehicle{
public void start(){ System.out.println("Starting the truck..."); }
public void stop(){ System.out.println("The truck has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 120 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 150 liters."); }
public void time(){ System.out.println("Time per kilometer: 3 minutes."); }
}
class Bus implements Vehicle{
public void start(){ System.out.println("Starting the bus..."); }
public void stop(){ System.out.println("The bus has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 200 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 250 liters."); }
public void time(){ System.out.println("Time per kilometer: 4 minutes."); }
}
class ElectricCar implements Vehicle{
public void start(){ System.out.println("Starting the electric car silently..."); }
public void stop(){ System.out.println("The electric car has stopped."); }
public void fuelCapacity(){ System.out.println("Battery capacity: 75 kWh."); }
public void maxfuelCapacity(){ System.out.println("Max Battery capacity: 90 kWh."); }
public void time(){ System.out.println("Time per kilometer: 50 seconds."); }
}
class Scooter implements Vehicle{
public void start(){ System.out.println("Starting the scooter..."); }
public void stop(){ System.out.println("The scooter has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 5 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 7 liters."); }
public void time(){ System.out.println("Time per kilometer: 2.5 minutes."); }
}
class Van implements Vehicle{
public void start(){ System.out.println("Starting the van..."); }
public void stop(){ System.out.println("The van has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 70 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 85 liters."); }
public void time(){ System.out.println("Time per kilometer: 1.5 minutes."); }
}
class AutoRickshaw implements Vehicle{
public void start(){ System.out.println("Starting the auto rickshaw..."); }
public void stop(){ System.out.println("The auto rickshaw has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 10 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 12 liters."); }
public void time(){ System.out.println("Time per kilometer: 2 minutes."); }
}
class Bicycle implements Vehicle{
public void start(){ System.out.println("Starting the bicycle..."); }
public void stop(){ System.out.println("The bicycle has stopped."); }
public void fuelCapacity(){ System.out.println("No fuel required."); }
public void maxfuelCapacity(){ System.out.println("No fuel tank."); }
public void time(){ System.out.println("Time per kilometer: 5 minutes."); }
}
class Ambulance implements Vehicle{
public void start(){ System.out.println("Starting the ambulance with siren..."); }
public void stop(){ System.out.println("The ambulance has stopped."); }
public void fuelCapacity(){ System.out.println("Fuel capacity: 80 liters."); }
public void maxfuelCapacity(){ System.out.println("Max Fuel capacity: 100 liters."); }
public void time(){ System.out.println("Time per kilometer: 45 seconds (emergency mode)."); }
}
public class Interface {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Choose a vehicle (1-10):");
System.out.println("1.Car 2.Bike 3.Truck 4.Bus 5.ElectricCar");
System.out.println("6.Scooter 7.Van 8.AutoRickshaw 9.Bicycle 10.Ambulance");
int choice = scan.nextInt();
Vehicle v;
switch(choice){
case 1: v = new Car(); break;
case 2: v = new Bike(); break;
case 3: v = new Truck(); break;
case 4: v = new Bus(); break;
case 5: v = new ElectricCar(); break;
case 6: v = new Scooter(); break;
case 7: v = new Van(); break;
case 8: v = new AutoRickshaw(); break;
case 9: v = new Bicycle(); break;
case 10: v = new Ambulance(); break;
default:
System.out.println("Invalid choice!");
return;
}
System.out.println("\nVehicle Details:");
v.start();
v.fuelCapacity();
v.maxfuelCapacity();
v.time();
v.stop();
}
}