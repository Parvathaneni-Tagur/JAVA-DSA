
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbber=");
        int k = sc.nextInt();

        if (k >= 0) {
            k = k % arr.length;
            reverse(arr, k);
        } else {
            k = (k % arr.length)+arr.length;
            reverse(arr, k);
        }
        printarr(arr);

        sc.close();
    }

    public static void reverse(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];

            }
            arr[0] = temp;
        }

    }

    public static void printarr(int[] arr) {
        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p]);
        }
    }

}
