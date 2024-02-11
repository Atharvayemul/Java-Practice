public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        printinfo("Hello world");
        printinfo("");
        printinfo("\t \n");

        String helloworld = "Hello World";
        System.out.println("index of r " + helloworld.indexOf('l'));
        System.out.println("index of r " + helloworld.lastIndexOf('l'));


        String helloworldlower = helloworld.toLowerCase();
        if (helloworld.equals(helloworldlower))
        {
            System.out.println("Values match");
        }
        if (helloworld.equalsIgnoreCase(helloworldlower))
        {
            System.out.println("values are ignoreing cases");
        }

        if (helloworld.startsWith("Hello"))
        {
            System.out.println("String starts with zero");
        }

        if (helloworld.endsWith("World"))
        {
            System.out.println("String ends with world");
        }

    }

    public  static  void printinfo(String string)
    {
        int length = string.length();
        System.out.println(length);

        if (string.isEmpty())
        {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank())
        {
            System.out.println("String is Blank");
        }
        System.out.println(string.charAt(0));

        System.out.println("Last char = " + string.charAt((length-1)));

    }
}