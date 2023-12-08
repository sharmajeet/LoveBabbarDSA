public class removeAllAdjecentDuplicates{
    public static String removeAdjecent(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(sb.length()>0 && str.charAt(i) == sb.charAt(sb.length()-1)){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Jeet sharrma";
        System.out.println(removeAdjecent(str));
    }
}