public class aTOi {
    public static void main(String[] args) {
        String str = "42";
        System.out.println("A_to_i = " + a_to_i(str));
        
    }

    public static int a_to_i(String str) {
        int num = 0;
        int i = 0;
        int sign = 0;
        // first we have to remove white spaces
        while (str.charAt(i) == ' ') {
            i++;
        }
        

        // now we have to maintain sign
        if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i) == '+' ? 1 : -1;
            ++i;
        }

        // now we have to convert the string in to int
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            // Check for overflow
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && str.charAt(i) > '7')) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            // Update the number
            num = num * 10 + (str.charAt(i) - '0');
            ++i;
        }
        return num * sign;

    }
}
