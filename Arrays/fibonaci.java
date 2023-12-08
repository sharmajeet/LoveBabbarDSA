import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for the limit : ");

        int limit = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("Value of N1 : " + n1);
        System.out.println("Value of N2 : " + n2);
        System.out.println("Upcoming Values For Fib Series...");

        // condition
        for (int i = 2; i < limit; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + ", ");

            n1 = n2;
            n2 = n3;
        }
    }
}