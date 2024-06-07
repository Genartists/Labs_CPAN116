class FactorialCalculator {
    private long num;
    private long res;

    
    public void calculateFactorial(long num) {
        this.num = num; // assign the input to the class variable
        this.res = 1; // initialize the result to 1

        // check if the input is negative or 0. If positive then calculate the factorial
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            // for loop to calculate the factorial
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            System.out.println("The factorial of " + num + " is " + res);
        }
    }
}
