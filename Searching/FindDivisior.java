public class FindDivisior {
    public static double optimizeDivisior(int dividend, int divisior, int presision) {
        int ans = 0;
        int start = 0;
        int end = Math.abs(dividend);
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (Math.abs(mid * divisior) == Math.abs(dividend)) {
                ans = Math.abs(mid);
            }
            // for left search
            if (Math.abs(mid * divisior) > Math.abs(dividend)) {
                end = Math.abs(mid) - 1;
            } else {
                // first store ans
                ans = Math.abs(mid);
                // right search
                start = Math.abs(mid) + 1;
            }
            mid = start + (end - start) / 2;
        }
        double step = 0.1;
        double finalans = ans;
        for (int i = 0; i < presision; i++) {
            for (double j = finalans; j * j < dividend; j = j + step) {
                finalans = j;
            }
            step = step / 10;
        }
        // System.out.println("Fianl ans =" + finalans);
        // condition for return ans + or - ,
        if ((dividend > 0 && divisior > 0) || (dividend < 0 && divisior < 0)) {
            return finalans;
        } else {
            return -finalans; // return ans with negative sign
        }
    }

    // not optimize for negative values
    public static double findDivisior(int dividend, int divisior, int presision) {
        int ans = -1;
        int start = 0;
        int end = dividend;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (mid * divisior == dividend) {
                ans = mid;
            }
            if (mid * divisior > dividend) {
                // left search
                end = mid - 1;
            } else { // mid * divisior < dividend
                     // first store the privious and
                ans = mid;
                // right search
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        double step = 0.01;
        double finalans = ans;
        for (int i = 0; i < presision; i++) {
            for (double j = finalans; j * j <= dividend; j = j + step) {
                finalans = j;
            }
            step = step / 10;
        }

        return finalans;
    }

    public static void main(String[] args) {
        int dividend = -2100;
        int divisior = -22;
        int presision = 2;
        // int ans = findDivisior(dividend, divisior);
        double ans = optimizeDivisior(dividend, divisior, presision);
        System.out.print("Quetiont is : " + ans);
    }
}
