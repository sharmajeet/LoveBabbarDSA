package Recursion;
public class LastOcuurence {
    public static void main(String[] args) {
        String str = "jeetsharmaakbvdjeea";
        char target = 'a';
        int i = 0;
        int[] ans = new int[] { -1 };
        search(str, i, target, ans);
        System.out.println(target + "Last occurenc is : " + ans[0]);
    }

    public static int search(String str, int i, char target, int[] ans) {
        // base case
        if (i >= str.length()) {
            return -1;
        }

        // 1 case mene solve kiya 
        if (str.charAt(i) == target) {
            ans[0] = i;
        }
        //baki recursion sambhal lega
        return search(str, i + 1, target, ans);
    }
}
