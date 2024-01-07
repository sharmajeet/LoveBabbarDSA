import java.util.Arrays;
import java.util.Collection;

public class Rotaion {
    public static void main(String[] args) {
        String str = "abcdef";
        int rotation = 1;
        char arr[] = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < rotation; i++) {
            System.out.print(arr[i]);
        }
    }
}
