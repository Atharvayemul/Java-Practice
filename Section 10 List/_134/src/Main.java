import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] originalArray = new String[]{"first","second","third"};

        var originallist = Arrays.asList(originalArray);
        originallist.set(0,"one");
        System.out.println("list " + originallist);
        System.out.println("array : " + Arrays.toString(originalArray));

        originallist.sort(Comparator.naturalOrder());
        System.out.println("array " + Arrays.toString(originalArray));

        originallist.add("fourth");

        List<String> newlist = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newlist);



    }
}