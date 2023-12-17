public class StringComprehienson {
    public static void main(String[] args) {
        char str[] = new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println("After Compraised String Is : " + compress(str));
    }

    public static int compress(char[] str) {
        int start = 0;
        int end = 0;
        int len = str.length;

        if(len == 1){
            return 1;
        }

        while (start < len) {
            int count = 1;
            char curr = str[start];

            while (start + 1 < len && str[start] == str[start + 1]) {
                count++;
                start++;
            }

            if (count == 1) {
                str[end++] = curr;
            } else {
                if (count > 1) {
                    str[end++] = curr;
                    String ResultString = count + "";
                    for (int i = 0; i < ResultString.length(); i++) {
                        str[end++] = ResultString.charAt(i);
                    }
                }
            }
            start++;
        }
        return end;
    }

}