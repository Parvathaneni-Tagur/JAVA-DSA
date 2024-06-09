public class sumOnetoN {

    static void sum_of_one_to_n(int n, int sum) {

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum_of_one_to_n(n-1, sum+n);
    }

    public static void main(String[] args) {
        int n = 10, sum = 0;
        sum_of_one_to_n(n, sum);
    }
}