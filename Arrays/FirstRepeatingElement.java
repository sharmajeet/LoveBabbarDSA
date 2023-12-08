import java.util.HashSet;

public class FirstRepeatingElement {
    // gfg solution
    public static int firstRepeated(int[] arr, int n) {
        // optimal approch
        HashSet <Integer> hash = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        
        for(int j=0;j<arr.length;j++){
            if(hash.contains(j)){
                return j+1;
            }else{
                hash.add(arr[j]);
            }
        }
            return -1;
    
        
        }
   
    public static int optimalApproch(int arr[]) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.contains(arr[i])) {
                return arr[i];
            } else {
                hash.add(arr[i]);
            }
        }
        return -1;
    }
    
   
    public static int basicApproch(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,9, 3, 4, 3, 5, 6};
        int n= arr.length;
        System.out.print("Repeating Element Find At : ");
        // System.out.println(optimalApproch(arr));
        System.out.println(firstRepeated(arr,n));
    }
}
