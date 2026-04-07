import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 2 * n - 1;

        for (int i = 0; i < total; i++) {
            int row = (i < n) ? i : total - i - 1;

            for (int j = 0; j < total; j++) {
                if (j == n - row - 1 || j == n + row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
