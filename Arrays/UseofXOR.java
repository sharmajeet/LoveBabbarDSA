import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UseofXOR {

    public static int findUnique(ArrayList<Integer> arrlist) {
        int ans = 0;
        int count = 0;
        int arr[] = new int[arrlist.size()];

        Collections.sort(arrlist);

        for (int i = 0; i < arrlist.size(); i++) {
            ans = ans ^ arrlist.get(i);

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // first we taking user inputs
        int n;
        System.out.print("Enter the size of Array : ");
        n = sc.nextInt();

        ArrayList<Integer> arrlist = new ArrayList<>();
        System.out.println("Enter The Elements : ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arrlist.add(num);
        }

        // printing arrlist
        System.out.println(arrlist);
        int uniqueElement = findUnique(arrlist);
        System.out.println("Unique Element is : " + uniqueElement);

    }
}
