public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishwasher().setHasWorkTodo(true);
//        kitchen.getDishwasher().doDishes();
//        kitchen.getIcebox().setHasWorkTodo(true);
//        kitchen.getIcebox().orderfood();
//        kitchen.getBrewMaster().setHasWorkTodo(true);
//        kitchen.getBrewMaster().brewCoffe();

        kitchen.setkitchenstatus(true,false,true);
        kitchen.dokitchenwork();
    }
}