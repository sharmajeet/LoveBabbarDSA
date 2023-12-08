import java.util.Arrays;

public class AdvanceBinary {
    public static int upperBound(int arr[] , int target){
        int start = 0 ;
         int end = arr.length-1;
         int mid = start + (end - start)/2;
         int ans = -1;
        while(start <= end){
            if(arr[mid] == target){
                ans = mid;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
            mid=  start + (end - start)/2;
        }

         return ans;
    }
    public static int lowerBound(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                ans = mid;
            }
            if (arr[mid] >= target) {
                // ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
            mid = start + (end -start) / 2;
        }
        return ans;
    }
   
    public static void main(String[] args) {
        int arr[] = { 7, 5, 1, 2, 6, 5, 8, 6, 6, 6, 6, 55, 222, 33, 6, 75, 6, 6, 41, 18 };
        Arrays.sort(arr);
        int target = 6;
        System.out.println(lowerBound(arr, target));
        System.out.println(upperBound(arr, target));
       
    }
}
