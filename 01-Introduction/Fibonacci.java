public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 5, count = 01;
                while (count <= n + 1) {
            System.out.println(a);
            int sum = a+b;
            a=b;
            b=sum;
            count++;
        }

    }
}
