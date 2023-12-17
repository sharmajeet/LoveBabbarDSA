public class FindTheFirstOcuurence {
    public static void main(String[] args) {
        String s = "a";
        String target = "a";

        System.out.println("Target found at index : " + findOccurence(s, target));
    }

    public static int findOccurence(String s, String target) {
        int s_length = s.length();
        int t_length = target.length();

        for(int i=0;i<=s_length-t_length;i++){
            for(int j=0;j<t_length;j++){

                if(s_length == 0 && s.charAt(i)==target.charAt(j)){
                    return 0;
                }
                if(i+j>=s_length || s.charAt(i+j) != target.charAt(j)){
                    break;
                }
                if(j == t_length-1){
                    return i;
                }
            }
        }
        return -1;
    }

}
