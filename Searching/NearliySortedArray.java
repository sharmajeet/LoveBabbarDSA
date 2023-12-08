import java.util.Scanner;
// there is three possible case where searching element was exist (1)arr[mid] == target , (2)arr[mid-1] == target ,(3) arr[mid+1] == target and for right side abd left side we check after 3 index because -1 and +1 are alrady comapred.

public class NearliySortedArray {
    public static int search(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            // 3 cases where nearly sorted element are possible
            if (arr[mid] == target) {
                ans = mid;
            }
            if (mid - 1 >= start && arr[mid - 1] == target) {
                ans = mid - 1;
            }
            if (mid + 1 <= end && arr[mid + 1] == target) {
                ans = mid + 1;
            }
            // other cases
            if (target > arr[mid]) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 40, 20, 50, 60, 80, 70 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        int ans = search(arr, target);
        System.out.println("Element found at index : " + ans);

    }
}