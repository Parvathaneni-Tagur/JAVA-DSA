import java.util.*;

public class CenterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of ");
        int n = sc.nextInt();
        int trow = n;
        int spaces = n - 1;
        int stars = 1;
        for (int row = 1; row <= trow; row++) {
            // work for the current row

            // spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // next row
            System.out.println();
            spaces--;
            stars += 2;
        }
    
    }
}
