import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        System.out.print("Enter the array values : ");
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                list.add(sc.nextInt());
            }
            arr.add(list);
        }

        System.out.println(arr);
    }
}
