public class Calculator {

    
    public static double add(double a, double b) {
        return a + b;
    }


    public static double subtract(double a, double b) {
        return a - b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static String divide(double a, double b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Error: Division by zero!";
        }
    }

