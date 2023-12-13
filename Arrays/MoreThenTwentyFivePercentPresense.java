public class MoreThenTwentyFivePercentPresense {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,4,6,5,6,6,6,6,};
        System.out.println("Is greter then 25% in array : " + isgt(arr));
    }
    public static int isgt(int arr[]){
        int size = arr.length;
        int quater = size / 4;

        for(int i=0;i<size-quater;i++){
            if(arr[i] == arr[i+quater]){
                return arr[i];
            }
        }
        return -1;
    }
}
