public class Main {
    public static void main(String[] args) {


        ComputerCase theCase = new ComputerCase("2208","DELL","240");

        Monitor theMonitor = new Monitor("27 inch beast","Acer",27,"2540 * 1330");

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.22");

        Perosonal thepc = new Perosonal("2208","Dell",theCase,theMonitor,theMotherboard);

//        thepc.getMonitor().drawpixelat(10,10,"red");
//        thepc.getMotherboard().loadprogram("Windows OS");
//        thepc.getComputerCase().presspowerButton();

        thepc.powerup();

    }
}