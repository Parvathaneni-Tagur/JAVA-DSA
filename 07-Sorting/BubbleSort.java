public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 8, 2 };
        int n = arr.length;
        int temp;
        for (int i = n - 1; i >= 0; i--) {

            for (int j = i; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}