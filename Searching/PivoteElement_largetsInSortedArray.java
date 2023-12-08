public class PivoteElement_largetsInSortedArray {
    public static int findPivote(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if (mid + 1 <= end && arr[mid] < arr[mid + 1]) {
            //     return mid;
            // }
            // if (mid - 1 >= start && arr[mid] > arr[mid - 1]) {
            //     return mid - 1;
            // }
            if(mid >0 && arr[mid]<= arr[mid-1]){
                return mid;
            }
            if (arr[mid] >= arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        int pivote = findPivote(arr);
        System.out.println("Pivote Element Find At Index : " + pivote);
        System.out.println("Pivote Element Is : " + arr[pivote]);
    }

}
