package day4exceptionhandling.nestedtrycatch;

public class NestedTryCatch {
    public static int divide(int[] arr, int divisor, int index){
        try{
            int element = arr[index];
            try{
                return element/divisor;
            } catch (ArithmeticException e){
                throw new ArithmeticException("Cannot divide by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Invalid array index");
        }
    }

    public static void main(String[] args) {
        try{
            int arr[] = {2, 6, 7, 4, 9, 8, 1};
            int divisor = 3;
            int index = 4;

            System.out.println("Result : " + divide(arr, divisor, index));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
