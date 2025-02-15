package day5regex.replaceandmodify.censorbadwords;

public class CensorBadWords {
    public static String censorBadWords(String text, String[] badWords){
        for (String word : badWords){
            text = text.replaceAll("\\b" + word + "\\b", "****");
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};

        System.out.println("Original text : " + text);

        String censoredText = censorBadWords(text, badWords);
        System.out.println("Modified text : " + censoredText);
    }
}
