import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = returnArray(10);
        System.out.println(Arrays.toString(arr));
       arr = sortIntegers(arr);
        System.out.println(Arrays.toString(arr));



    }

    private static int[] returnArray(int len)
    {
        Random random = new Random();
        int[] myarr = new int[len];

        for (int i = 0 ; i < len ; i++)
        {
            myarr[i] = random.nextInt(100);
        }
        return myarr;
    }

    public static int[] sortIntegers (int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag)
        {
            flag = false;
            for (int i = 0 ; i < sortedArray.length - 1; i++)
            {
                if (sortedArray[i] < sortedArray[i + 1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}