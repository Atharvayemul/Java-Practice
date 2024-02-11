public class Main {
    public static void main(String[] args) {

        String helloworld = "Hello" + "World";
        helloworld.concat(" and Goodbye");

        StringBuilder helloworldbuilder = new StringBuilder("Hello" + "World");
        helloworldbuilder.append(" and Goodbye");

        printinfo(helloworld);
        printinfo(helloworldbuilder);

        StringBuilder emptystart = new StringBuilder();
        emptystart.append("a".repeat(17));

        StringBuilder emptystart32 = new StringBuilder(32);
        emptystart32.append("a".repeat(17));

        printinfo(emptystart);
        printinfo(emptystart32);

        StringBuilder buildeerplus = new StringBuilder("Hello " + "World");
        buildeerplus.append(" and goodbye");

        buildeerplus.deleteCharAt(16).insert(16,'g');
        System.out.println(buildeerplus);

        System.out.println(buildeerplus.reverse());


    }

    public  static  void printinfo(String string)
    {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }

    public  static  void printinfo(StringBuilder string)
    {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
        System.out.println("Capacity = " + string.capacity());
    }
}
