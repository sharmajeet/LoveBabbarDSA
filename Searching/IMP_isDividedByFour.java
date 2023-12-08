import java.util.Scanner;

public class IMP_isDividedByFour {
    public static boolean isDivided(int num) {
        if (num <= 0) {
            return false;
        }
        // condtion
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        boolean ans = isDivided(num);
        System.out.print("Is Divivded by 4 ? -> " + ans);
    }
}
