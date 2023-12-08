import java.util.Scanner;

public class FindSquareRootRange {
    public static int square(int num, int presision) {
        int target = num;
        int start = 0;
        int end = num;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start < end) {
            if (mid * mid == target) {
                ans = mid;
            }
            if ((long)mid * mid > (long)target) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        // presision
        double step = 0.1;
        double finalans = ans;
        for (int i = 0; i < presision; i++) {
            for (double j = finalans; j * j <=num; j = j + step) {
                finalans = j;
            }
            step = step / 10;
        }
        System.out.println("Final answer = " + finalans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int num = sc.nextInt();
        System.out.print("Enter Pressision Value : ");
        int presision = sc.nextInt();
        System.out.print("");
        System.out.print("Square root of " + num + " is : ");
        square(num, presision);
    }
}
// 2147395599 -- test case value for long int testing
