public class TripletPair {
    public static void tripletpair(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            int element1 = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int element2 = arr[j];
                {
                    for (int k = j + 1; k < arr.length; k++) {
                        int element3 = arr[k];
                        if (element1 + element2 + element3 == target) {
                            System.out.println("{" + element1 + "," + element2 + "," + element3 + "}");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int target = 100;
        System.out.println("All possible pairs for target : " + target);
        tripletpair(arr, target);
    }
}
