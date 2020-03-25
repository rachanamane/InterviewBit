import java.util.ArrayList;

public class Solution {

    /**
     * Return index of occurrence if the number exists in the sorted array
     */
    public static int binarySearch(int num, int[] arr) {
        if (num < arr[0] || num > arr[arr.length-1]) {
            return -1;
        }
        int low = 0;
        int high = arr.length -1;
        while (low <= high) {
            int mid = (low + high )/ 2;
            if (num == arr[mid]) {
                return mid;
            }
            if (num > arr[mid]) {
                low = mid + 1;
            }
            if (num < arr[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }
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

    /**
     * https://www.interviewbit.com/problems/implement-power-function/
     */
    public int pow(int x, int n, int d) {
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(sqrt(2147483647));
//        int[] arr =  new int[]{1, 2, 3, 6, 6, 9};
//        System.out.println(binarySearch(1, arr));
//        System.out.println(nCr(4,2));
    }
}
