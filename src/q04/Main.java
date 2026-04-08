import java.util.*;

public class Main {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();

            if (isPerfect(n)) {
                System.out.println("Perfect");
            } else if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
