// import String.lengthOfString;

public class Practice1 {
    public static void main(String[] args) {
        String str = "jeet@sharma@31179";
        find(str);
    }

    public static void find(String str) {
        char arr[] = str.toCharArray();
        int vovel = 0;
        int digit = 0;
        int con = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '@' || currentChar == '$' || currentChar == '&' || currentChar == ' ') {
                continue;
            }

            else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vovel++;
            } else if (Character.isDigit(currentChar)) {
                digit++;

            } else {
                con++;
            }
        }
        System.out.println("vovels : " + vovel + ", digits : " + digit + ", con : " + con);
    }

}
