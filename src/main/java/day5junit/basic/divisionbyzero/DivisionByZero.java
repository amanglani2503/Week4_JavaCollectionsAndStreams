package day5junit.basic.divisionbyzero;

public class DivisionByZero {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try{
            int a = 10, b = 0;
            System.out.println("Division Result : " + divide(a, b));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
