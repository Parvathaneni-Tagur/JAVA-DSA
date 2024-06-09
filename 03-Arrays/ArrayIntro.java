
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[2];
        System.out.println(arr);// '['means an array D= double @= addres of array
        System.out.println(arr[0]);

        arr[0] = 21;
        System.out.println(arr[0]);
        System.out.println(arr.length);
        sc.close();

        // enhanced for loop
        System.out.println("------enhanced-----");
        for (double val : arr) {
            System.out.println(val);
        }
    }
}