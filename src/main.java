import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FactorialCalculator myFact = new FactorialCalculator();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number (or exit to quit): ");
                if (sc.hasNextInt()) {
                    int numInput = sc.nextInt();
                    myFact.calculateFactorial(numInput);
                } else {
                    String next = sc.next();
                    String exit = "exit";
                    if (next.equalsIgnoreCase(exit)) {
                        System.out.println("Thank for using the program!");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number" + e.getMessage());
        }
    }
}
