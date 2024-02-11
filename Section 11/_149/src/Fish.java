public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed == "small"){
            System.out.println(getexplicittype() + " lazily swimming ");
        }else {
            System.out.println(getexplicittype() + "darting frantically");
        }

    }

    @Override
    public void makenoise() {

        if (type == "Goldfish"){
            System.out.println("Swish!");
        }else {
            System.out.println("Splash!");
        }

    }
}
