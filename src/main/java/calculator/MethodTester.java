package calculator;

public class MethodTester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(" adding " + calculator.add(1,2) + "\n" );
        System.out.println("subtraction " + calculator.subtract(5, 5) + "\n");
        System.out.println("multiplication " + calculator.multiply(5, 5) + "\n");
        System.out.println("division " + calculator.divide(5, 5) + "\n");
        System.out.println("Square root " + calculator.squareRoot(6) + "\n");
        System.out.println("Calculate Exponents " + calculator.calculateExponent(6, 2));
    }
}
