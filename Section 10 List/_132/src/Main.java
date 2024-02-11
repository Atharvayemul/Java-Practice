import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] items = {"apples","bananas","milk","eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yoghurt");
        System.out.println(groceries);

        ArrayList<String> nextlist = new ArrayList<>(List.of("pickles","mustard","cheese"));
        System.out.println(nextlist);

        groceries.addAll(nextlist);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard"))
        {
            System.out.println("list contains mustard");
        }

        groceries.add("yoghurt");
        System.out.println("fist " + groceries.indexOf("yoghurt"));
        System.out.println("last "+ groceries.lastIndexOf("yoghurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yoghurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples","milk","mustard","cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty " + groceries.isEmpty());

        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","pikes","mustard","ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray( new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }

}