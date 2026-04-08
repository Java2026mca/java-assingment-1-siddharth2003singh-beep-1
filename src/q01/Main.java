import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalRows = 2 * n - 1;

        for (int i = 0; i < totalRows; i++) {

            int row = (i < n) ? i : totalRows - i - 1;

            // leading spaces
            for (int s = 0; s < n - row - 1; s++) {
                System.out.print(" ");
            }

            // stars and inner spaces
            if (row == 0) {
                System.out.print("*");
            } else {
                System.out.print("*");

                for (int s = 0; s < 2 * row - 1; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            if (i < totalRows - 1) System.out.println();
        }
    }
}
