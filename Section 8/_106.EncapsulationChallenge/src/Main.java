public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count " + printer.getPagesPrinted());

        int pagesprinted = printer.printPages(5);
        System.out.println("Current Job Pages " + pagesprinted);
        System.out.println("printer total " + printer.getPagesPrinted());
    }
}