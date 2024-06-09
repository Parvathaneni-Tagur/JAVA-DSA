import java.util.Scanner;

public class Sidetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int trow = n;
        int stars = 1;
        for (int row = 1; row <= trow; row++) {
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            System.out.println();
            if (row <= trow / 2)
                stars++;
            else
                stars--;
        }
        sc.close();
    }
}