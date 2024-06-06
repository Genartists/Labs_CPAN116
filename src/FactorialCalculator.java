class FactorialCalculator {
    private long num;
    private long res;

    public void calculateFactorial(long num) {
        this.num = num;
        this.res = 1;
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            System.out.println("The factorial of " + num + " is " + res);
        }
    }
}
