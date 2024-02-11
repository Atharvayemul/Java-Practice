// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List :" +
                "\t\u2022 First Point" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textblock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textblock);

        int age = 35;
        System.out.printf("Your age is %d\n", age);


        int yearOfbirth = 2023 - age;
        System.out.printf("Age = %d , Birth year = %d\n",age,yearOfbirth);

        for (int i = 1 ; i <= 1000 ; i *=10)
        {
            System.out.printf("Printing %d %n",i);
        }

        String formattedstring = String.format("your age is %d",age);
        System.out.println(formattedstring);

    }
}