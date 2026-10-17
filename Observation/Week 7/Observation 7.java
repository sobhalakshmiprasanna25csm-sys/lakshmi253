
public class Observation7 {
    public static void main(String[] args) {

        System.out.println("OBSERVATION 7: JAVA EXCEPTION CLASSES");
        System.out.println("-------------------------------------");

        // 1. ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException caught");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. ArrayIndexOutOfBoundsException caught");
        }

        // 3. NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("3. NullPointerException caught");
        }

        // 4. NumberFormatException
        try {
            int value = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("4. NumberFormatException caught");
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String word = "Java";
            System.out.println(word.charAt(8));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("5. StringIndexOutOfBoundsException caught");
        }

        // 6. NegativeArraySizeException
        try {
            int[] values = new int[-3];
        } catch (NegativeArraySizeException e) {
            System.out.println("6. NegativeArraySizeException caught");
        }

        // 7. ClassCastException
        try {
            Object item = Integer.valueOf(25);
            String converted = (String) item;
        } catch (ClassCastException e) {
            System.out.println("7. ClassCastException caught");
        }

        // 8. IllegalArgumentException
        try {
            Thread.sleep(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("8. IllegalArgumentException caught");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
        }

        // 9. InputMismatchException
        try {
            java.util.Scanner scanner =
                new java.util.Scanner("hello");
            int input = scanner.nextInt();
            scanner.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("9. InputMismatchException caught");
        }

        // 10. UnsupportedOperationException
        try {
            throw new UnsupportedOperationException(
                "Demo exception"
            );
        } catch (UnsupportedOperationException e) {
            System.out.println("10. UnsupportedOperationException caught");
        }

        System.out.println("-------------------------------------");
        System.out.println("All 10 exception demonstrations completed.");
    }
}
