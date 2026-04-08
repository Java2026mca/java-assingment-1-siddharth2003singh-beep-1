import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        // Spiral fill
        while (top <= bottom && left <= right) {

            // left to right
            for (int i = left; i <= right; i++) {
                a[top][i] = num++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                a[i][right] = num++;
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    a[bottom][i] = num++;
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    a[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        // Diagonal sum
        int diag = 0;
        for (int i = 0; i < n; i++) {
            diag += a[i][i];
        }

        System.out.print("Diagonal: " + diag);
    }
}
