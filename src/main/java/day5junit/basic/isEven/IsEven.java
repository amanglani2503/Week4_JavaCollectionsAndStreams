package day5junit.basic.isEven;

public class IsEven {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println(number + " is even : " + isEven(number));
    }
}
