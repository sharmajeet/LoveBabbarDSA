import java.lang.reflect.Array;
import java.util.Arrays;

public class longestCommanPrefix {
    public static void main(String[] args) {
        String str[] = { "jeet", "jeetludi", "jeetudi" };

        System.out.println("Longest comman prefix : " + match(str));
    }

    // method
    public static String commanPrefix(String[] str) {

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int i = 0;

        while (i < first.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return first.substring(0, i);
    }

    // method 2
    public static String match(String[] str) {
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int i = 0;

        while (i < first.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;

            } else {
                break;
            }
        }
        return first.substring(0, i);

    }
}
