public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 8, 2 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i ; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}