public class findlongestPalindrome {
    public static void main(String[] args) {
        String str = "ababbd";
        System.out.println("Logngest Palindrome :" + palindrome(str));
    }

    public static boolean isCheck(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static String palindrome(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isCheck(str, i, j)) {
                    String t = str.substring(i, j+1);
                    ans = t.length() > ans.length() ? t : ans;
                }
            }
        }
        return ans;
    }
}
