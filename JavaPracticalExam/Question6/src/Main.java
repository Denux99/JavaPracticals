class MathUtil {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int number = 5;
        int factorialResult = MathUtil.factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }
}