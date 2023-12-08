import java.util.Collection;
import java.util.Collections;

public class reverseOnlyLetters {
    public static void main(String[] args) {
        String str = "a-bC-dEf-ghIj";

        System.out.println("String with only reverse characters : " + optimize(str));
    }

    // method

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);

        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (Character.isLetter(sb.charAt(i)) && Character.isLetter(sb.charAt(j))) {
                int length = sb.length();
                // swap
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            } else if (!Character.isLetter(sb.charAt(i))) {
                i++;
            } else {
                j--;
            }
        }
        return sb.toString();
    }

    // method 2 optimize approch
    public static String optimize(String str) {
        char ch[] = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j))) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            } else if(!Character.isLetter(str.charAt(i))) {
                // else swap

                i++;
               
            }else{
                j--;
            }

        }
        return new String(ch);

    }
}
