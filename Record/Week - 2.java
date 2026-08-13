// Library Management System demonstrating OOP concepts

public class LibraryManagementSystem {

    // Part A & B: Class, Object, Constructor and Encapsulation
    static class Book {

        private int bookId;
        private String bookName;
        private String author;
        private double price;

        // Default constructor
        Book() {
            bookId = 0;
            bookName = "Unknown";
            author = "Unknown";
            price = 0.0;
        }

        // Parameterized constructor
        Book(int bookId, String bookName, String author, double price) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.author = author;
            this.price = price;
        }

        // Getters
        int getBookId() {
            return bookId;
        }

        String getBookName() {
            return bookName;
        }

        String getAuthor() {
            return author;
        }

        double getPrice() {
            return price;
        }

        // Setters
        void setBookId(int bookId) {
            this.bookId = bookId;
        }

        void setBookName(String bookName) {
            this.bookName = bookName;
        }

        void setAuthor(String author) {
            this.author = author;
        }

        void setPrice(double price) {
            this.price = price;
        }

        void displayBook() {
            System.out.println("Book ID   : " + bookId);
            System.out.println("Book Name : " + bookName);
            System.out.println("Author    : " + author);
            System.out.println("Price     : " + price);
        }
    }

    // Part C: Inheritance
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age : " + age);
        }
    }

    static class Student extends Person {
        int rollNo;

        Student(String name, int age, int rollNo) {
            super(name, age);
            this.rollNo = rollNo;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Roll No: " + rollNo);
        }
    }

    static class Faculty extends Person {
        String subject;

        Faculty(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Subject: " + subject);
        }
    }

    // Part D: Method Overloading
    static class AreaCalculator {

        // Area of circle
        double area(double radius) {
            return Math.PI * radius * radius;
        }

        // Area of rectangle
        double area(double length, double breadth) {
            return length * breadth;
        }

        // Area of square
        int area(int side) {
            return side * side;
        }
    }

    // Method Overriding
    static class Vehicle {
        void display() {
            System.out.println("This is a Vehicle");
        }
    }

    static class Car extends Vehicle {
        @Override
        void display() {
            System.out.println("This is a Car");
        }
    }

    static class Bike extends Vehicle {
        @Override
        void display() {
            System.out.println("This is a Bike");
        }
    }

    // Part E: Abstraction
    static abstract class Shape {
        abstract void draw();
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Interface
    interface Printable {
        void print();
    }

    static class Report implements Printable {
        @Override
        public void print() {
            System.out.println("Printing Library Report");
        }
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        // Classes and Objects
        System.out.println("\n--- BOOK DETAILS ---");

        Book book1 = new Book(
                101,
                "Java Programming",
                "James Gosling",
                550.0
        );

        book1.displayBook();

        // Default constructor
        Book book2 = new Book();

        book2.setBookId(102);
        book2.setBookName("Data Structures");
        book2.setAuthor("Mark Allen");
        book2.setPrice(600.0);

        System.out.println("\n--- SECOND BOOK ---");
        book2.displayBook();

        // Inheritance
        System.out.println("\n--- INHERITANCE ---");

        Student student = new Student(
                "Prasanna",
                20,
                101
        );

        System.out.println("Student Details:");
        student.displayInfo();

        Faculty faculty = new Faculty(
                "Ravi",
                40,
                "Java Programming"
        );

        System.out.println("\nFaculty Details:");
        faculty.displayInfo();

        // Method Overloading
        System.out.println("\n--- METHOD OVERLOADING ---");

        AreaCalculator calculator = new AreaCalculator();

        System.out.println(
                "Area of Circle = " + calculator.area(5.0)
        );

        System.out.println(
                "Area of Rectangle = " + calculator.area(10.0, 5.0)
        );

        System.out.println(
                "Area of Square = " + calculator.area(5)
        );

        // Method Overriding
        System.out.println("\n--- METHOD OVERRIDING ---");

        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.display();
        vehicle2.display();

        // Abstraction
        System.out.println("\n--- ABSTRACTION ---");

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        // Interface
        System.out.println("\n--- INTERFACE ---");

        Printable report = new Report();
        report.print();

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}
