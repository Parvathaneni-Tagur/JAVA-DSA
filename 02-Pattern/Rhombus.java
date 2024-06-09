import java.util.Scanner;

public class Rhombus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    int stars = 1, spaces = n / 2;
    int trow = n;
    for (int row = 1; row <= trow; row++) {
      for (int csp = 1; csp <= spaces; csp++) {
        System.out.print(" ");
      }

      for (int cst = 1; cst <= stars; cst++) {
        System.out.print("*");
      }

      System.out.println();
      if (row <= trow / 2) {
        stars += 2;
        spaces--;
      } else {
        spaces++;
        stars -= 2;
      }

    }
    sc.close();
  }
}