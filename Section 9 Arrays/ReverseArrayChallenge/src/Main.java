import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = new int[5];
            Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        reverse(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }
    private static void reverse(int[] arr)
    {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 -i] = temp;
        }
    }
}