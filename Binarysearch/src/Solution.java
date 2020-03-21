public class Solution {
    /**
     * https://www.interviewbit.com/problems/square-root-of-integer/
     */
    public static int sqrt(int A) {
        if (A == 0 || A== 1) {
            return A;
        }
        long low = 1;
        long high = A;
        while (low<=high) {
            long mid = (low + high) / 2;
            if (mid * mid == A) {
                return (int) mid;
            }
            if (mid*mid > A) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) high;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));
    }
}
