import java.util.ArrayList;
import java.util.HashSet;

public class UnionSorted {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };
        brutForce(arr1, arr2);
        Optimal(arr1, arr2);
    }

    private static void Optimal(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        ArrayList<Integer> result = new ArrayList<>();

        while (n > i && m > j) {

            if (arr1[i] <= arr2[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;

        }
        System.out.println(result);

    }

    private static void brutForce(int[] arr1, int[] arr2) {
        HashSet<Integer> unionset = new HashSet<Integer>();
        for (Integer i : arr1) {
            unionset.add(i);
        }
        for (Integer i : arr2) {
            unionset.add(i);
        }
        for (Integer integer : unionset) {
            System.out.print(integer + " ");
        }
    }
}