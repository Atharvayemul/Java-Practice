

abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getexplicittype() + " ");
        System.out.println(speed.equals("slow")? "walks" : "runs");
    }

    public abstract void shedhair();
}


public abstract  class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makenoise();

    public final String getexplicittype(){
        return getClass().getSimpleName() + "("+ type + ")";
    }

}
