import java.util.ArrayList;
import java.util.List;

public class K_ClosestElements {

    public static List<Integer> TwoPtr(int arr[], int k, int diff) {
        int low = 0;
        int high = arr.length - 1;

        while (high - low >= k) {

            if (k - arr[low] >= arr[high] - k) {
                low++;
            } else {
                high--;
            }
        }

            List<Integer> result = new ArrayList<>();
            for (int i = low; i <= high; i++) {
                result.add(arr[i]);
            
            }
            return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 4;
        int diff = 3;
        System.out.println(TwoPtr(arr, k, diff));
    }
}