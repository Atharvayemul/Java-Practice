import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] newArray = new int[5];
        System.out.println();

        for ( int element : newArray)
        {
            System.out.print(element + " ");
        }
//        For each loop for iterating through the array

        System.out.println(Arrays.toString(newArray));
        Object objectvariable = newArray;
        if (objectvariable instanceof int[])
        {
            System.out.println("Object variable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;


    }
}