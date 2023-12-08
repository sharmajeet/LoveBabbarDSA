public class PeekElementOfPyramid {
    public static int peekElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,10,8,7,6,5,4,3,2,1};
        int ans = peekElement(arr);
        System.out.println("Peek Element index is : " + ans);
        System.out.println("Ans is : "+ arr[ans]);
    }
}
