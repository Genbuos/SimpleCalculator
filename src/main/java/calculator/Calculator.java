package calculator;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return  a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int  divide(int a, int b){
        return a / b;
    }
    public int squareRoot(int a){
        double sqrt = Math.sqrt(a);
        int result = (int) sqrt;
        return result;
    }
    public int calculateExponent(int base, int exponent){
        int result = 1;
        if(exponent == 0){
            return 1;
        }
        for(int i = 1; i <= exponent; i++){
            result = result * base;
        }
        return result;
    }
}
