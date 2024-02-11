public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//       Item avocado = new Item("Topping","avocado",1.50);
//       avocado.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addTopping("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerTopping("BACON","CHEESE","MAYO");
//        regularMeal.setdrinkSize("LARGE");
//        regularMeal.printItemizedList();
//}

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerTopping("LETTUCE","CHEESE","MAYO");
//        secondMeal.setdrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxMeal = new MealOrder("deluxe","7-up","chili");
        deluxMeal.addBurgerTopping("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxMeal.setdrinkSize("SMALL");
        deluxMeal.printItemizedList();


    }

}