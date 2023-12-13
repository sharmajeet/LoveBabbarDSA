// write a progra in java take string  to  create an array that conatins name age and roll no 

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

        String[] arr = new String[] { "jeet", "18", "7107" };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}