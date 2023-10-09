import java.util.Scanner;

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to vote"); // Prompt the user to input their age.
        int a = sc.nextInt(); // Read the user's input.

        try {
            validateAge(a); // Attempt to validate the age and handle any potential exception.
        } catch (MinorException e) {
            System.out.println(e.getLocalizedMessage()); // Print a custom message when a MinorException is caught.
        }
    }

    public static void validateAge(int age) throws MinorException {
        if (age >= 18) {
            System.out.println("You are eligible to vote!"); // If the age is 18 or older, the user is eligible to vote.
        } else {
            throw new MinorException("You are not eligible to vote"); // If the age is less than 18, throw a custom MinorException.
        }
    }
}
