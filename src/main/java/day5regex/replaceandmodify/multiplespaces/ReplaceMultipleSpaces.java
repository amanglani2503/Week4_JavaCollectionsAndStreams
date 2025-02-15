package day5regex.replaceandmodify.multiplespaces;

public class ReplaceMultipleSpaces {
    public static String replaceMultipleSpaces(String text){
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String text = "This is   an example   with multiple  spaces.";

        System.out.println("Original String : " + text);

        System.out.println("String with single spaces : " + replaceMultipleSpaces(text));
    }
}
