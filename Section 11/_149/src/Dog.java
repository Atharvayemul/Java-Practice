public class Dog extends Mammal{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed == "slow"){
            System.out.println(getexplicittype() + " walking");
        }else {
            System.out.println(getexplicittype() + " running");
        }

    }

    @Override
    public void shedhair() {
        System.out.println(getexplicittype() + " shed hair all the time");
    }

    @Override
    public void makenoise() {

        if (type == "Wolf"){
            System.out.println("Howling!");
        }else {
            System.out.println("Woof!");
        }

    }

}
