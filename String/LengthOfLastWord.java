// leetcode 58
public class LengthOfLastWord {

    public static int findLength(String s){
        int count = 0;
        s =s.trim();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = " jeet sharma";
        System.out.println("last word length : " + findLength(s));
    }
}
