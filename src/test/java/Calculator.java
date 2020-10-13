public class Calculator {

    public static double addition(double x, double y) {
        double result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        return result;
    }

    public static double subtraction(double x, double y) {
        double result = x - y;
        System.out.println(x + " - " + y + " = " + result);
        return result;
    }

    public static double multiplication(double x, double y) {
        double result = x * y;
        System.out.println(x + " * " + y + " = " + result);
        return result;
    }

    public static double division(double x, double y) {
        double result = x / y;
        if (y == 0) {
            System.out.println("division by 0");
            throw new ArithmeticException();
        } else {
            System.out.println(x + " / " + y + " = " + result);
        }
        return result;
    }
}