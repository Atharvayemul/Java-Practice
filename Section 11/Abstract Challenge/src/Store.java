import java.util.ArrayList;

public class Store {

    private static ArrayList<Productforsale> storeprodcuts = new ArrayList<>();



    public static void main(String[] args) {
        storeprodcuts.add(new Artobject("Oil Painting",1350,"Impressionatiscticwork by ABf painted in 2015"));
        storeprodcuts.add(new Artobject("Sculpture",2000,"Bronze work by JKF produed in 2015"));
        listproducts();

    }
    public static void listproducts(){
        for (var item:storeprodcuts){
            System.out.println("-".repeat(30));
            item.showdetails();
        }
    }

    public static void additemtoorder(ArrayList<Orderitem> order , int orderindex,int qty){
        order.add(new Orderitem(qty,storeprodcuts.get(orderindex)))
    }

    public static void printorder(ArrayList<Orderitem> order){
        double salestotal = 0;
        
    }
}