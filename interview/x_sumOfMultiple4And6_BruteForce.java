import java.util.*;

class x_sumOfMultiple4And6_BruteForce  {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumMultiples(n));
    }

    public static int sumMultiples(int n) {
        return sumDivisibleBy(n, 4) + sumDivisibleBy(n, 6) - sumDivisibleBy(n, 12);
    }

    private static int sumDivisibleBy(int n, int k) {
        int p = (n - 1) / k; // Number of terms
        return k * p * (p + 1) / 2;
    }
}
