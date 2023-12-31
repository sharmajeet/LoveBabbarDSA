package Recursion;

public class PrintDigit {
    public static void main(String[] args) {
        int num = 647;
        if (num == 0) {
            System.out.print(0 + " ");
        }

        printdigit(num);
    }

    public static void printdigit(int num) {
        if (num == 0) {
            return;
        }

        int newNumber = (num / 10);
        printdigit(newNumber);
        int digit = num % 10;

        System.out.print(digit + " ");

    }
}
