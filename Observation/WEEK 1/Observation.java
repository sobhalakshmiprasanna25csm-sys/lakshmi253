import java.util.Scanner;

public class StudentUtilityProgram {

    // Method to calculate factorial
    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Method to check prime number
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to find maximum of two numbers
    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to calculate area of circle
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Part A: Student Information
        System.out.println("===== STUDENT UTILITY PROGRAM =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage : " + percentage);

        // Part B: Conditional Statements
        System.out.println("\n===== CONDITIONAL STATEMENTS =====");

        System.out.print("Enter a number to check Even/Odd: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        System.out.println("\nEnter three numbers:");

        System.out.print("Number 1: ");
        int a = sc.nextInt();

        System.out.print("Number 2: ");
        int b = sc.nextInt();

        System.out.print("Number 3: ");
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Largest number = " + largest);

        // Grade using if-else
        System.out.print("\nEnter percentage to find grade: ");
        double percent = sc.nextDouble();

        if (percent >= 90) {
            System.out.println("Grade: A");
        } else if (percent >= 80) {
            System.out.println("Grade: B");
        } else if (percent >= 70) {
            System.out.println("Grade: C");
        } else if (percent >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Day using switch
        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // Part C: Looping Statements
        System.out.println("\n===== LOOPING STATEMENTS =====");

        // Multiplication table
        System.out.print("Enter number for multiplication table: ");
        int table = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        // Numbers from 1 to N
        System.out.print("\nEnter N: ");
        int n = sc.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        // Sum of first N natural numbers
        int sum = 0;

        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("\nSum of first " + n +
                " natural numbers = " + sum);

        // Fibonacci series
        System.out.print("\nEnter number of Fibonacci terms: ");
        int terms = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        // Part D: Methods
        System.out.println("\n\n===== USER-DEFINED METHODS =====");

        System.out.print("Enter number for factorial: ");
        int factNum = sc.nextInt();

        System.out.println("Factorial = " + factorial(factNum));

        System.out.print("\nEnter number to check prime: ");
        int primeNum = sc.nextInt();

        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is Prime");
        } else {
            System.out.println(primeNum + " is Not Prime");
        }

        System.out.print("\nEnter two numbers to find maximum: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Maximum = " + maximum(x, y));

        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println("Area of Circle = " + circleArea(radius));

        sc.close();
    }
}
