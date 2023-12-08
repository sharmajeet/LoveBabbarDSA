import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class K_diff_pairs {
    public static void kdiff_pair(int arr[], int k) {
        int i = 0;
        int j = 1;
        Set<Map.Entry<Integer, Integer>> pairSet = new HashSet<>();
        int count = pairSet.size();

        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                pairSet.add(new AbstractMap.SimpleEntry<>(arr[i], arr[j]));
                i++;
                j++;

            } else if (diff > k) {
                i++;
            } else {
                j++;
            }

        }
        for (Map.Entry<Integer, Integer> entry : pairSet) {
            System.out.println("Pair: (" + entry.getKey() + ", " + entry.getValue() + ")");
        }
        // return pairset.size();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 1, 9, 4, 3 };
        Arrays.sort(arr);
        int k = 2;
        // System.out.println(kdiff_pair(arr, k));
        kdiff_pair(arr, k);
    }
}
