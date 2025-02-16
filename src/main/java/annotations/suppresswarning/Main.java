package annotations.suppresswarning;

public class Main {
    public static void main(String[] args) {
        WarningSuppressor suppressor = new WarningSuppressor();
        suppressor.useRawList();
    }
}