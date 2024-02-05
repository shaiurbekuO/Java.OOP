import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0 && n < 10000) {
            boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
            System.out.println(isPowerOfTwo ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
