package String;

import java.util.Scanner;

public class lengthOfString {

    public static int findLength(char arr[]){
        int i = 0;
        int length =0 ;

        while(i < arr.length){
            length++;
            i++;
        }
        return length;
    }

    public static void main(String[] args) {

        // String str = "Hello World";
        // char[] charArray = str.toCharArray();
        // System.out.println(charArray[1]);

        int n = 100;
        char arr[] = new char[n];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        arr = input.toCharArray();
        System.out.println(arr);
        // length function for char array
        System.out.println("length of string is : " + arr.length);
        System.out.print("Length For Given String Is : " + findLength(arr));


        
    }
}
