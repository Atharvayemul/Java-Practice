import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Animal animal = new Animal("animal","big",100)

        Dog dog = new Dog("Wolf","big",100);
        dog.makenoise();

        doanimalstuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepard","big",150));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Fish("Barcudda","big",75));
        animals.add(new Dog("pug","small",20));

        animals.add(new horse("Cydesdale","large",1000));

        for (Animal animal:animals){
            doanimalstuff(animal);
            if (animal instanceof  Mammal currentmammal){
                currentmammal.shedhair();
            }
        }

    }

    private static void doanimalstuff(Animal animal){

        animal.makenoise();
        animal.move("slow");
    }
}