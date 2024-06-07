import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Create an instance of the FactorialCalculator class
        FactorialCalculator myFact = new FactorialCalculator();

        // Create prompt to get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Calculator!");

        // Infinite loop to keep asking for input
        while (true) {
            System.out.print("Enter a number (or exit to quit): ");
            // outer if statement check if user input is an integer
            if (sc.hasNextInt()) {
                int numInput = sc.nextInt();
                myFact.calculateFactorial(numInput); // call the calculateFactorial method
            }
            // exit the program if user types "exit"
            else {
                String exit = sc.next();
                if (exit.equalsIgnoreCase("exit")) {
                    System.out.println("Thank for using the program!");
                    break;
                }
                // raise error if user input is not an integer
                else {
                    System.out.println("Please enter a valid number");
                }
            }
        }
    }
}
