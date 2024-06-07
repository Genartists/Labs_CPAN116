import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FactorialCalculator myFact = new FactorialCalculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Calculator!");
        while (true) {
            System.out.print("Enter a number (or exit to quit): ");
            if (sc.hasNextInt()) {
                int numInput = sc.nextInt();
                myFact.calculateFactorial(numInput);
            } else {
                String exit = sc.next();
                if (exit.equalsIgnoreCase("exit")) {
                    System.out.println("Thank for using the program!");
                    break;
                } else {
                    System.out.println("Please enter a valid number");
                }
            }
        }
    }
}
