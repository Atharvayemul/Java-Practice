import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        java.util.Arrays is a java helper class which provides built-int methods for arrays

        int[] firstarray = getrandomarray(10);
        System.out.println(Arrays.toString(firstarray));
        Arrays.sort(firstarray);
        System.out.println(Arrays.toString(firstarray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));


        int[] thirdArray = getrandomarray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallArray));

        int[] largerArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));

    }

    private static  int[] getrandomarray(int len)
    {
        Random random = new Random();
        int[] myInt = new int[len];
        for (int i = 0; i < len ; i++)
        {
            myInt[i] = random.nextInt(100);
        }
        return myInt;
    }
}