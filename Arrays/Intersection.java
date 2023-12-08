import java.util.ArrayList;

public class Intersection {
    public static void intersection(ArrayList<Integer> list) {
        int arr[] = { 1, 2, 3, 4, 5, 6,6,6 };
        int brr[] = { 6,6, 7, 8, 9, 10 };

        ArrayList<Integer> ans = new ArrayList<>();

        // loop on arr[]
        for (int i = 0; i < arr.length; i++) {
            // int element = arr[i];
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    // we mark a value of j so another time it is not counted
                    brr[j] = -1;
                    ans.add(arr[i]);
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        intersection(list);

    }
}