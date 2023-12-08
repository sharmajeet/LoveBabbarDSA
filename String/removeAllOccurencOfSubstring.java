public class removeAllOccurencOfSubstring {
    public static String removePart(String str, String part){

        int length = part.length();
        StringBuilder sb = new StringBuilder(str);

        while(sb.indexOf(part) != -1){
            int start = sb.indexOf(part);
            sb.delete(start,start+length);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abcbcbcdabcdabc";
        String part = "abc";

        System.out.println("Final String : " + removePart(str,part));
    }
}
