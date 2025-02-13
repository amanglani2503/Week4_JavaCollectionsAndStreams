package day4exceptionhandling.multiplecatch;

public class RetrieveElement {
    public static int retrieveElement(int[] arr, int index){

        // throwing exception if array is not initialized
        if(arr == null){
            throw new CustomNullPointerException("Array is not initialized");
        }

        // checking for out of bound Index
        if(index >= arr.length || index < 0){
            throw new CustomArrayIndexOutOfBoundsException("Invalid Index");
        }

        //  if no exception occurred, returning the element
        return arr[index];
    }

    public static void main(String[] args) {

        try{
            int[] arr = {1,2,3,4,5};
            int index = 0;
            System.out.println("Element at index " + index + " : " + retrieveElement(arr, index));

        } catch (CustomNullPointerException e){
            System.out.println("Exception : " + e.getLocalizedMessage());
        } catch (CustomArrayIndexOutOfBoundsException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
