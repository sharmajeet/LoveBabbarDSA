import java.util.ArrayList;
import java.util.Collections;

public class SortZeroAndOne{
    public static void sort(ArrayList<Integer>list){
        int i=0;
        int start = 0;
        int end = list.size()-1;

        while(start != end){
            if(list.get(i) == 0){
                Collections.swap(list, start, i);
                start++;
                i++;
            }
            else{
                Collections.swap(list,i,end);
                end--;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting ");
        sort(list);
    }
}