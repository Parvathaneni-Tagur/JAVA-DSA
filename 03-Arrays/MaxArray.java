public class MaxArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int max = 0, min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];

            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}