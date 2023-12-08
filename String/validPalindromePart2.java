public class validPalindromePart2 {
    
    public static boolean checkCondition(StringBuilder sb, int i, int j){
        while(i <= j){
            if(sb.charAt(i) == sb.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        StringBuilder sb = new StringBuilder(str);

        while(i <= j){
            if(sb.charAt(i) != sb.charAt(j)){
                // there is two condtions if we remove 'i' or 'j' to make string palindrome
                return checkCondition(sb, i+1 ,j ) || checkCondition(sb , i , j-1);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abca";
        System.out.println("Is Palindrome : " + isPalindrome(str));
    }
}
