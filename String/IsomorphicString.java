public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg";
        String t = "zoa";
        System.out.println("String's are isomorphic : " + isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        int size = 256;
        int s_hash[] = new int[size];
        boolean t_hash[] = new boolean[size];

        for (int i = 0; i < s.length(); i++) {
            if (s_hash[s.charAt(i)] == 0 && !t_hash[t.charAt(i)]) {
                s_hash[s.charAt(i)] = t.charAt(i);
                t_hash[t.charAt(i)] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s_hash[s.charAt(i)] != t.charAt(i)) {
                return false;
            }

        }
        return true;
    }
}
