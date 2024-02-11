public class Dog extends  Animal {
    private String earshape;
    private String tailshape;
    public Dog(){
        super("Mutt","Big",50);
    }

    public Dog(String type, double weight)
    {
        this(type,weight,"Perky","Curled");
    }
    public Dog(String type,  double weight, String earshape, String tailshape) {
        super(type,weight < 15 ? "small" : (weight < 35 ? "medium" : "large") , weight);
        this.earshape = earshape;
        this.tailshape = tailshape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earshape='" + earshape + '\'' +
                ", tailshape='" + tailshape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise()
    {
        if (type == "Wolf" )
        {
            System.out.println("Ow Wooooo");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk run and wag their tail");
        if (speed == "slow")
        {
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark()
    {
        System.out.println("Woof ");
    }

    private void run(){
        System.out.println("Dog Running");
    }

    private void walk(){
        System.out.println("Dog Walking");
    }

    private void wagTail(){
        System.out.println("Tail Wagging ");
    }
}
