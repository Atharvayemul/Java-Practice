public class Main {
    public static void main(String... args) {
        System.out.println("Hello world!");

        String[] splitstring = "Hello World Again".split(" ");
        printtext(splitstring);

        System.out.println("_".repeat(20));
        printtext("Hello");
    }
    private static void printtext(String... textlist)
    {
        for (String t:textlist)
        {
            System.out.println(t);
        }
    }
}