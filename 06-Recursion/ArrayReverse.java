import java.util.Scanner;
public class ArrayReverse {

    static int[] reverse(int i, int j, int[] arr) {

        if (i < j) {

            int tep = arr[i];
            arr[i] = arr[j];
            arr[j] = tep;

            reverse(i + 1, j - 1, arr);
        }
        return arr;
        
    }

    public static void main(String[] args) {

       Scanner sc =new Scanner(System.in);
       int[] arr= new int[5];
       for(int m=0;m<5;m++){

         arr[m] = sc.nextInt();
       }

       int i = 0, j = (arr.length) - 1;
        reverse(i, j, arr);
        System.out.println("output");
        for (int k = 0; k <= j; k++) {
            System.out.println(arr[k]);
        }
        sc.close();

    }
}