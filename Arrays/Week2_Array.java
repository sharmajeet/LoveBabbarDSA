import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week2_Array {
    // finding duplicate numbers in arrlist
    public static void isDuplicate( ArrayList<Integer>arraylist , int size){
      
        // printing arraylist
        for (int i=0;i<size;i++) {
            System.out.print(i + " ");
        }

    }
    public static int find(ArrayList<Integer>arrayList , int size){
        int ans =0 ;
        for(int i=0;i<arrayList.size();i++){
            ans = ans ^ arrayList.indexOf(i);
        }
        return ans;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        ArrayList<Integer> arrlist = new ArrayList<>();
        // while (sc.hasNextInt()) {
        // int input = sc.nextInt();
        // arrlist.add(input);
        // }
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            arrlist.add(input);

        }
        sc.close();
        isDuplicate(arrlist,size);
       System.out.println("Element is : " + find(arrlist,size));
       
    }
}