import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== 📚 Book Information System ===");
        System.out.println("Select Book Type:");
        System.out.println("1 - Science Book     | 2 - Fiction Book");
        System.out.println("3 - Mathematics Book | 4 - Java Programming Book");
        
        System.out.print("\nEnter choice (1-4): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice < 1 || choice > 4) {
            System.out.println("❌ Invalid choice! Please run again.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price (₹): ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Number of Pages: ");
        int pages = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter ISBN (13 digits): ");
        String isbn = sc.nextLine();

        System.out.print("Enter Publication Year: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Average Rating (0-5): ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Book book;

     
        if (choice == 1) {
            book = new ScienceBook(title, author, price, pages, isbn, year, rating);
        } 
        else if (choice == 2) {
            book = new FictionBook(title, author, price, pages, isbn, year, rating);
        } 
        else if (choice == 3) {
            book = new MathematicsBook(title, author, price, pages, isbn, year, rating);
        } 
        else {  // choice == 4
            book = new JavaBook(title, author, price, pages, isbn, year, rating);
        }

        System.out.println("\n" + "=".repeat(50));
        book.displayInfo();
        System.out.println("=".repeat(50));
        
        sc.close();
    }
}


abstract class Book {
    protected String title, author, isbn;
    protected double price, rating;
    protected int pages, year;

    Book(String title, String author, double price, int pages, String isbn, int year, double rating) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.isbn = isbn;
        this.year = year;
        this.rating = rating;
    }

    abstract void displayInfo();
    
    void displayBasicInfo() {
        System.out.printf("| %-35s | ₹%-8.2f |\n", title, price);
        System.out.printf("| Author: %-25s | Pages: %4d |\n", author, pages);
        System.out.printf("| ISBN: %-20s | Year: %4d |\n", isbn, year);
        System.out.printf("| Rating: %-24.1f★ |\n", rating);
    }
}

class ScienceBook extends Book {
    private String subjectArea;

    ScienceBook(String title, String author, double price, int pages, String isbn, int year, double rating) {
        super(title, author, price, pages, isbn, year, rating);
        this.subjectArea = "Physics/Chemistry/Biology";
    }

    void displayInfo() {
        System.out.println("📖 SCIENCE BOOK DETAILS");
        System.out.println("=".repeat(35));
        super.displayBasicInfo();
        System.out.printf("| Subject: %-27s | Category: Educational |\n", subjectArea);
        System.out.println("| Suitable For: School/College Students |");
    }
}

class FictionBook extends Book {
    private String genre;

    FictionBook(String title, String author, double price, int pages, String isbn, int year, double rating) {
        super(title, author, price, pages, isbn, year, rating);
        this.genre = "Thriller/Romance/Fantasy";
    }

    void displayInfo() {
        System.out.println("📚 FICTION BOOK DETAILS");
        System.out.println("=".repeat(35));
        super.displayBasicInfo();
        System.out.printf("| Genre: %-32s | Category: Entertainment |\n", genre);
        System.out.println("| Perfect For: Bedtime Reading/Leisure |");
    }
}

class MathematicsBook extends Book {
    private String level;

    MathematicsBook(String title, String author, double price, int pages, String isbn, int year, double rating) {
        super(title, author, price, pages, isbn, year, rating);
        this.level = "B.Tech/Engineering Level";
    }

    void displayInfo() {
        System.out.println("📐 MATHEMATICS BOOK DETAILS");
        System.out.println("=".repeat(38));
        super.displayBasicInfo();
        System.out.printf("| Level: %-32s | Category: Academic |\n", level);
        System.out.println("| Topics: Calculus, Matrices, Laplace |");
    }
}

class JavaBook extends Book {
    private String javaVersion;

    JavaBook(String title, String author, double price, int pages, String isbn, int year, double rating) {
        super(title, author, price, pages, isbn, year, rating);
        this.javaVersion = "Java 17/21 (Latest)";
    }

    void displayInfo() {
        System.out.println("☕ JAVA PROGRAMMING BOOK DETAILS");
        System.out.println("=".repeat(40));
        super.displayBasicInfo();
        System.out.printf("| Java Version: %-24s | Category: Programming |\n", javaVersion);
        System.out.println("| Topics: OOP, Collections, Streams, Lambda |");
    }
}
