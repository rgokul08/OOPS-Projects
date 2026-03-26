import java.util.*;
class InsufficientBalanceException extends Exception {
public InsufficientBalanceException(String message) {
super(message);
}
}
class Account {
private String bankName;
private String accountHolder;
private double balance;
public Account(String bankName, String accountHolder, double balance) {
this.bankName = bankName;
this.accountHolder = accountHolder;
this.balance = balance;
}
public void deposit(double amount) {
if (amount <= 0) {
System.out.println("Invalid deposit amount.");
return;
}
balance += amount;
System.out.println("Amount deposited successfully.");
}
public void withdraw(double amount) throws InsufficientBalanceException {
if (amount <= 0) {
throw new InsufficientBalanceException("Error: Invalid withdrawal amount.");
}
if (amount > 10000) {
throw new InsufficientBalanceException("Error: Maximum withdrawal limit is 10000.");
}
if (amount > balance) {
throw new InsufficientBalanceException("Error: Insufficient balance.");
}
balance -= amount;
System.out.println("Amount withdrawn successfully.");
}
public void display() {
System.out.println("\nBank Name: " + bankName);
System.out.println("Account Holder: " + accountHolder);
System.out.println("Balance: " + balance);
}
public double getBalance() {
return balance;
}
}
public class Solution {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Bank Name: ");
String bank = sc.nextLine();
System.out.print("Enter Account Holder Name: ");
String name = sc.nextLine();
System.out.print("Enter Initial Balance: ");
double balance = sc.nextDouble();
Account acc = new Account(bank, name, balance);
int choice;
do {
System.out.println("\n===== ATM MENU =====");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Display Account Details");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
try {
switch (choice) {
case 1:
System.out.print("Enter amount to deposit: ");
double dep = sc.nextDouble();
acc.deposit(dep);
break;
case 2:
System.out.print("Enter amount to withdraw: ");
double wd = sc.nextDouble();
acc.withdraw(wd);
break;
case 3:
System.out.println("Current Balance: " + acc.getBalance());
break;
case 4:
acc.display();
break;
case 5:
System.out.println("Thank you for using ATM.");
break;
default:
System.out.println("Invalid choice.");
}
}
catch (InsufficientBalanceException e) {
System.out.println(e.getMessage());
}
} while (choice != 5);
sc.close();
}
}