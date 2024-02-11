import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] myintarray = new int[5];
        int[] anotherarray = myintarray;
//        another array is the reference to the my int arra

        System.out.println("myintarray" + Arrays.toString(myintarray));
        System.out.println("Another Array" + Arrays.toString(anotherarray));

        anotherarray[0] = 1;
        modifyArray(myintarray);

        System.out.println("After changin another array " + Arrays.toString(anotherarray));
        System.out.println("After changin myintArray" + Arrays.toString(myintarray));

    }

    private static void modifyArray(int[] arary)
    {
        arary[1] = 2;
    }
}