package Recursion;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Reverse : ");
        reverseFun(5);
        System.out.println("Forward : ");
        printInt(5);
    }

    public static void reverseFun(int n) {

        // base case
        if (n == 0) {
            return;
        }

        // processing
        System.out.println(n);

        // recursion
        reverseFun(n - 1);
    }

    public static void printInt(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // recursion
        printInt(n - 1);

        // processing
        System.out.println(n);
    }
}
