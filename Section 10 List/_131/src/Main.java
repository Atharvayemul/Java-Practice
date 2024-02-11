import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type,int count)
{
    public GroceryItem(String name ){
        this(name,"DAIRY",1);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));



        ArrayList<GroceryItem> grocylist = new ArrayList<>();
        grocylist.add(new GroceryItem("Butter"));
        grocylist.add(new GroceryItem("milk"));
        grocylist.add(0,new GroceryItem("organes","PRODUCE",5));
        grocylist.remove(1);
        System.out.println(grocylist);
    }
}