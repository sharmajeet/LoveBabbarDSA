import java.util.ArrayList;

public class PairSum {
    public static void pair(ArrayList<Integer> list, int target) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    System.out.println("{" + arr[i] + "," + arr[j] + "}");

            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 9;
        pair(list, target);
    }
}
