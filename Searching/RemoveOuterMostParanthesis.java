
// removing only outer most parantheses
public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {

        String str = "((()))";

        System.out.println("Balanced : " + isBalanched(str));
    }

    public static String isBalanched(String str) {

        int ptr = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            if (current == '(') {
                if (ptr != 0) {
                    str = str + current;
                }
                ptr++;
            } else {
                if (ptr != 1) {
                    str = str + current;
                }
                ptr--;
            }
        }
        return str;
    }
}
