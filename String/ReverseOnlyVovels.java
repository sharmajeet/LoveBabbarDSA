public class ReverseOnlyVovels {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reverse String : " + optimizeReverse(str));
    }

    public static String optimizeReverse(String str) {
        char sb[] = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            while (i < j && !isVovel(sb[i])) {
                i++;
            }

            while (i < j && !isVovel(sb[j])) {
                j--;
            }

            if (i < j) {
                swap(sb, i, j);
                i++;
                j--;
            }

        }
        return new String(sb);
    }

    public static void swap(char[] sb, int i, int j) {
        char temp = sb[i];
        sb[i] = sb[j];
        sb[j] = temp;

    }

    public static boolean isVovel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    // not an optimize approch gives an error
    public static String reverse(String str) {
        // StringBuilder sb = new StringBuilder(str);
        char sv[] = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (isVovel(sv[i]) && isVovel(sv[j])) {
                // swap
                char temp = sv[i];
                sv[i] = sv[j];
                sv[j] = temp;
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return new String(sv);
    }

}
