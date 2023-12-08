// return the number of palindrome substring in given string

public class PalindromeSubstring {
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(
                "There is maximum \" " + findPalindromeSubstr(str) + " \" numbers of combination's are possible..");
    }

    // methods
    public static int findPalindromeSubstr(String str) {
        int count = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            // odd function
            int oddKaAns = checkPalindrome(str, i, i);
            count = count + oddKaAns;
            // even function
            int evenKaAns = checkPalindrome(str, i, i + 1);
            count = count + evenKaAns;
        }
        return count;
    }

    // checkPalindrome
    public static int checkPalindrome(String str, int i, int j) {
        int totalCount = 0;
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
            totalCount++;
            i--;
            j++;
        }
        return totalCount;
    }

}
