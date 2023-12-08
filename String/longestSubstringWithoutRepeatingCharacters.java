import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println("Toatal number of characters substring without repeating : " + revise(str));
    }

    // methods
    public static int noRepeatation(String str) {
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int end = 0;    

        for (int start = 0; start < str.length(); start++) {
            if (!charSet.contains(str.charAt(start))) {
                charSet.add(str.charAt(start));
                maxLength = Math.max(maxLength, start - end + 1);

            } else {
                while (charSet.contains(str.charAt(start))) {
                    charSet.remove(str.charAt(end));
                    end++;
                }
                charSet.add(str.charAt(start));
            }
        }
        return maxLength;
    }

    // revise
    public static int revise(String str) {
        int max = 0;
        int end = 0;
        Set<Character> myset = new HashSet<>();

        for (int start = 0; start < str.length(); start++) {
            if (!myset.contains(str.charAt(start))) {
                myset.add(str.charAt(start));
                max = Math.max(max, start - end + 1);

            } else {
                while (myset.contains(str.charAt(start))) {
                    myset.remove(str.charAt(end));
                    end++;
                }
                myset.add(str.charAt(start));
            }
        }
        return max;

    }

}