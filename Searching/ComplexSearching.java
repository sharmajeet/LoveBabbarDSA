// Most IMP
// this is 3rd approch of searching an element in an array

import java.util.ArrayList;

public class ComplexSearching {
    public static int search(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            // 1st case
            if (start == end) {
                // single element in array
                return start;
            }
            // 2nd case mid -> even or mid -> odd
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            mid = start + (end - start) / 2;
        }

        return -1;
    }

    public static int vectorSearch(ArrayList<Integer> list) {
        // ArrayList<Integer> arr = new ArrayList<>();
        int start = list.get(0);
        int end = list.get(list.size() - 1);
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (start == end) {
                return start;
            }
            if (mid % 2 == 0) {
                if (list.get(mid) == list.get(mid + 1)) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else {
                if (list.get(mid) == list.get(mid - 1)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 5, 5, 10, 10, 100, 100, 500 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        int result = vectorSearch(list);
        System.out.println("Value find at index : " + result);
        System.out.println("Result is : " + list.get(result));
        int ans = search(arr);
        System.out.println("Value find at index : " + ans);
        list.add(1);
        System.out.println("Ans is : " + arr[ans]);
    }
}