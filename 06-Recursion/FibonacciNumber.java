import java.util.Scanner;

public class FibonacciNumber {
    public static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int fib= fibo(n);
       System.out.println((fib));
       sc.close();
    }
}