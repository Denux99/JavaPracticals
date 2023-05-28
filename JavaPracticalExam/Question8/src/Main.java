public class Main {
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return dividend / divisor;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        dividend = 10;
        divisor = 0;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
