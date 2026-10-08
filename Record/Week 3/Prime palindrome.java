package recordprograms;
import java.util.Scanner;

public class PrimePalindrome {
    // Method to check whether a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method to check whether a number is palindrome
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n) && isPalindrome(n))
            System.out.println(n + " is a Prime Palindrome.");
        else
            System.out.println(n + " is not a Prime Palindrome.");
        sc.close();
    }
}
