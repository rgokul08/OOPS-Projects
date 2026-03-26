import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the account number");
    String a = sc.nextLine();
    System.out.println("Enter the account holder's name");
    String b = sc.nextLine();
    System.out.println("Enter the initial balance");
    double c = sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter the account type");
    String d = sc.nextLine();
    System.out.println("Enter the bank name");
    String e = sc.nextLine();
    System.out.println("Enter the branch name");
    String f = sc.nextLine();
    System.out.println("Enter the IFSC code");
    String g = sc.nextLine();
    BankAccount p = new BankAccount();
    p.setAccountNumber(a);
    p.setHoldername(b);
    p.setbalance(c);
    p.setAccountType(d);
    p.setBankName(e);
    p.setBranchName(f);
    p.setIFSC(g);
    p.display();
    System.out.println("Enter deposit amount");
    double amount = sc.nextDouble();
    p.deposit(amount);
    System.out.println("Enter withdrawal amount");
    double amount1 = sc.nextDouble();
    p.withdraw(amount1);
    p.display();
    }
}

class BankAccount {

    private String AccountNumber;
    private String Holdername;
    private double balance;
    private String AccountType;
    private String BankName;
    private String BranchName;
    private String IFSC;
    public void setAccountNumber(String a){
        this.AccountNumber =a;
    }
    public void setHoldername(String b){
        this.Holdername =b;
    }
    public void setbalance(double c){
        this.balance =c;
    }
    public void setAccountType(String d){
        this.AccountType =d;
    }
    public void setBankName(String e){
         this.BankName=e;
    }
    public void setBranchName(String f){
         this.BranchName=f;
    }
    public void setIFSC(String g){
         this.IFSC=g;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public String getHoldername(){
        return Holdername;
    }
    public double getbalance(){
    return balance;
}
     public String getAccountType(){
        return AccountType;
    }
     public String getBankName(){
        return BankName;
    }
    public String getBranchName(){
        return BranchName;
    }
     public String getIFSC(){
        return IFSC;
    }
    public void display() {
        System.out.println("Account Details");
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder Name: " + Holdername);
        System.out.println("Account Type: " + AccountType);
        System.out.println("Bank Name: " + BankName);
        System.out.println("Branch Name: " + BranchName);
        System.out.println("IFSC Code: " + IFSC);
        System.out.printf("Balance: $%.2f\n", balance);
    }
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Transaction");
        } else {
            balance += amount;
            System.out.printf("Deposit Successful. Updated Balance: $%.2f\n", balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0 || balance < amount) {
            System.out.println("Invalid Transaction");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal Successful. Updated Balance: $%.2f\n", balance);
        }
    }
}