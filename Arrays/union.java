import java.util.ArrayList;

public class union {
    public static int union(ArrayList<Integer> arrlist) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int sizea = arr.length;
        int brr[] = { 2, 4, 6, 8 };
        int sizeb = brr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        // push all elements into arrlist of ans
        for (int i = 0; i < sizea; i++) {
            ans.add(arr[i]);
        }
        // same for brr[]
        for (int j = 0; j < sizeb; j++) {
            ans.add(brr[j]);
        }
        // now printing ans vector
        System.out.println(ans);

        return 0;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        union(arrlist);
    }

}
