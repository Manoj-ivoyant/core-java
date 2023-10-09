import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Prompt the user to enter two numbers for division
        System.out.println("Enter two numbers to divide:");

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the two input numbers
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Display a message indicating division is about to occur
        System.out.println("Dividing two numbers");

        try {
            // Attempt the division and handle any exceptions
            int result = a / b;
            System.out.println(result);
        } catch (MinorException e) {
            // Handle a specific exception type (MinorException) if it occurs
            System.out.println(e);
            System.out.println("Exception caused due to: " + e.getMessage());
        } finally {
            // The finally block is used for cleanup tasks and will always execute
            System.out.println("The finally block is commonly used to ensure that essential cleanup tasks are performed, such as closing database connections and files, to prevent resource leaks. Importantly, it will be executed regardless of whether an exception occurred during the execution of the code.");
        }
    }
}
