package recordprograms;

public class Marks {
    public static void main(String[] args) {
        // Check whether exactly five marks are provided
        if (args.length != 5) {
            System.out.println("Please enter marks for exactly five subjects.");
            return;
        }

        int total = 0;
        // Read and add the five marks
        for (int i = 0; i < 5; i++) {
            int mark = Integer.parseInt(args[i]);
            total = total + mark;
        }

        // Calculate average
        double average = total / 5.0;

        // Display result
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}
