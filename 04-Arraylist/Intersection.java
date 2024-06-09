import java.util.ArrayList;

public class Intersection {

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40, 50 };
        int[] b = { 5, 20, 25, 40, 55, 60 };
        System.out.println(findinter(a, b));
    }

    public static ArrayList<Integer> findinter(int[] a, int[] b) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }

        }

        return result;
    }
}