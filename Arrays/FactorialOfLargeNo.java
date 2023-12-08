import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialOfLargeNo {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int carry = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < list.size(); j++) {
                int x = list.get(j) * i + carry;
                list.set(j, x % 10);
                carry = x / 10;

            }
            while (carry != 0) {
                list.add(carry % 10);
                carry = carry / 10;
            }
            // carry = 0;
        }
        Collections.reverse(list);
        for (int e : list) {
            System.out.print(e);
        }
        System.out.println();
        // Collections.reverse(list);
        // list.toString();
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        factorial(n);
    }
}
