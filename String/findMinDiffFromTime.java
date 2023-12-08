import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findMinDiffFromTime {
    // Main method
    public static void main(String[] args) {

        ArrayList<String> time = new ArrayList<>();
        // time.add("12:10");
        // time.add("10:15");
        // time.add("13:15");
        // time.add("17:20");
        // time.add("18:00");
        // time.add("19:47");
        time.add("23:59");
        time.add("00:00");
        System.out.println("Minimum Diffrence In Time : " + minDiffInTime(time));
    }

    // methods
    public static int minDiffInTime(List<String> time) {
        // step 1
        // first we convert String time in to int time value
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < time.size(); i++) {
            String current = time.get(i);

            int hours = Integer.parseInt(current.substring(0, 2));
            int min = Integer.parseInt(current.substring(3, 5));
            int totalMinutes = hours * 60 + min;

            // now we have to push all total minutes into list.
            list.add(totalMinutes);

        }

        // step 2 , sort the List
        Collections.sort(list);

        // step 3 : find Diff and then find MinDiff
        int min_diff = Integer.MAX_VALUE;
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            min_diff = Integer.min(min_diff, diff);
        }

        // main logic behind clock : 24 h = 1440 m
        int last_diff = (list.get(0) + 1440) - list.get(n - 1);
        min_diff = Integer.min(min_diff, last_diff);

        return min_diff;
    }

}
