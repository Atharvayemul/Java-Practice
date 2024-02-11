import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] arr = readintergers();

       int min = findMin(arr);
        System.out.println(min);

    }
    private static int readInteger()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int num = scanner.nextInt();
        return num;
    }

    private static int[] readElements(int n)
    {
        Scanner scanner = new Scanner(System.in);

        int[] myarr = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = scanner.nextInt();
        }
        return myarr;
    }

    private static int findMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < 5; i++) {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}