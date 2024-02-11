import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String[] sArray = {"A","B","c"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"A") >= 0)
        {
            System.out.println("Found A in the Array");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1,s2))
        {
            System.out.println("Arrays are eqal");
        }else {
            System.out.println("Arrays are not eqaul");
        }

    }
}