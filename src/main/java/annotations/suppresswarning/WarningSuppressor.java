package annotations.suppresswarning;

import java.util.ArrayList;
import java.util.List;

public class WarningSuppressor {

    @SuppressWarnings("unchecked")
    public void useRawList() {
        List rawList = new ArrayList(); // No generics used
        rawList.add("Unchecked warning suppressed");
        System.out.println(rawList.get(0));
    }
}