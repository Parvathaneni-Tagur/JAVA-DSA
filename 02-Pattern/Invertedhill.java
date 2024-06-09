public class Invertedhill {
    public static void main(String[] args) {
        int n = 5;

        // first row
        for (int frow = 1; frow <= 2 * n - 1; frow++) {
            System.err.print("*");
        }
        System.out.println();
        int trow = n - 1;
        int stars = n - 1, spaces = 1;
        for (int row = 1; row <= trow; row++) {
            // stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            System.out.println();
            stars--;
            spaces += 2;

        }
    }
}
