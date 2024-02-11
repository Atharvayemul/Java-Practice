public class SmartKitchen {

    private CoffeMaker brewMaster;

    private Dishwasher dishwasher;

    private Refrigerator icebox;

    public SmartKitchen() {
        brewMaster = new CoffeMaker();
        icebox = new Refrigerator();
        dishwasher = new Dishwasher();

    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

    public void setkitchenstatus(boolean coffeflag, boolean fridgeflag, boolean dishwasherflag)
    {
        brewMaster.setHasWorkTodo(coffeflag);
        icebox.setHasWorkTodo(fridgeflag);
        dishwasher.setHasWorkTodo(dishwasherflag);
    }

    public void dokitchenwork()
    {
        brewMaster.brewCoffe();
        icebox.orderfood();
        dishwasher.doDishes();

    }
}

class CoffeMaker
{
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void brewCoffe()
    {
        if (hasWorkTodo)
        {
            System.out.println("Brewing Coffe");
            hasWorkTodo = false;
        }
    }
}

class Refrigerator
{
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void orderfood()
    {
        if (hasWorkTodo)
        {
            System.out.println("Ordering food");
            hasWorkTodo = false;
        }
    }
}

class Dishwasher
{
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void doDishes()
    {
        if (hasWorkTodo)
        {
            System.out.println("Wasing dishes");
            hasWorkTodo = false;
        }
    }
}
