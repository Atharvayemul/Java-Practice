public class horse extends Mammal{


    public horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedhair() {
        System.out.println(getexplicittype() + " sheds in the spring");
    }

    @Override
    public void makenoise() {

    }
}
