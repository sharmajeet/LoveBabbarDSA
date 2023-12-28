package Recursion;

public class FibonaciSeries {

    public static void main(String[] args) {
        int n = 5;
        int ans = fib(n);
        System.out.println(ans);
    }

    public static int fib(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // recursive call
        int ans = (fib(n - 2) + fib(n - 1));

        return ans;
    }
}