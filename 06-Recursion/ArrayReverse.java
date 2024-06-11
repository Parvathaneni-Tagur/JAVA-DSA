public class ArrayReverse {
    static void swap(int i, int j, int[] arr) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int i, int j, int[] arr) {

        if (i >= j) {
            for (int k = 0; k < arr.length; k++)
                System.out.println(arr);
            return;
        }

        swap(i, j, arr);
        int tep = arr[i];
        arr[i] = arr[j];
        arr[j] = tep;

        reverse(i + 1, j - 1, arr);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 0, j = (arr.length) - 1;
        reverse(i, j, arr);

        System.out.println(arr[1] );
    }
}