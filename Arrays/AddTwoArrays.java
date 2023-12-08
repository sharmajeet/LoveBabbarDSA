import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArrays {
    public static String addition(int a[], int b[]) {
        int row = a.length;
        int i = row - 1;
        int col = b.length;
        int j = col - 1;
        int carry = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i >= 0 && j >= 0) {
            int x = a[i] + b[j] + carry;
            int digit = x % 10;
            ans.add(digit);
            carry = x / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int x = a[i] + 0 + carry;
            int digit = x % 10;
            ans.add(digit);
            carry = x / 10;
            i--;
        }
        while (j >= 0) {
            int x = 0 + b[j] + carry;
            int digit = x % 10;
            ans.add(digit);
            carry = x / 10;
            j--;
        }
        if (carry != 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        // Print the result as a string
        StringBuilder result = new StringBuilder();
        for (int num : ans) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 3, 4, 5, 6, 6, 7, 7 };
        int b[] = { 4, 5, 6, 8, 9, 0, 0 };
        
        System.out.println(addition(a, b));
    }

}
