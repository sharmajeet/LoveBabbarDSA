import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class AnagramString {
    public static void main(String[] args) {
        String s = "jeet";

        String t = "jtte";
        System.out.println("String is Anagram : " + optimize(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        char arr1[] = t.toCharArray();
        Arrays.sort(arr1);

        if (Arrays.equals(arr, arr1)) {
            return true;
        }
        return false;
    }

    // optimize approch

    public static boolean optimize(String s, String t) {
        // we create frequency table to count no of chars..
        int n = 256;
        int[] frqTable = new int[256];
       for (int i = 0; i < s.length(); i++) {
            frqTable[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            frqTable[t.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (frqTable[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
