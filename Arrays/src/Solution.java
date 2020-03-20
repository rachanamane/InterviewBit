import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * https://www.interviewbit.com/problems/arraybug/
     */
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> rotated = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int indexFrom = ((i + B ) % A.size());
            rotated.add(A.get(indexFrom));
        }
        return rotated;
    }

    /**
     * https://www.interviewbit.com/problems/spiral-order-matrix-i/
     */
    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>(A.size()*A.get(0).size());
        int top = 0;
        int bottom = A.size()-1;
        int left = 0;
        int right = A.get(0).size()-1;
        int direction = 0;
        while ((top  <= bottom) && (left <= right)){
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(A.get(top).get(i));
                }
                top++;
                direction = 1;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++){
                    result.add(A.get(i).get(right));
                }
                right--;
                direction = 2;

            } else if (direction == 2) {
                for (int i = right; i >= left ; i--){
                    result.add(A.get(bottom).get(i));
                }
                bottom--;
                direction = 3;

            } else {
                for (int i = bottom; i >= top; i--) {
                    result.add(A.get(i).get(left));
                }
                left++;
                direction = 0;
            }
        }
        return result;
    }

    /**
     * https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
     */
    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int cumulativeSteps = 0;
       for (int i = 0 ; i < A.size() - 1; i++) {
           int xDiff = Math.abs(A.get(i) - A.get(i+1));
           int yDiff = Math.abs(B.get(i) - B.get(i+1));
           cumulativeSteps += Math.max(xDiff, yDiff);
       }

       return cumulativeSteps;
    }

    /**
     * https://www.interviewbit.com/problems/max-non-negative-subarray/
     */
    public static int[] maxset(int[] A) {
        int start = 0;
        int end = 0;
        int maxSum = Integer.MIN_VALUE;
        int cumulative = 0;
        int subElements = 0;
        int maxElements = Integer.MIN_VALUE;
        for (int i = 0 ; i < A.length; ) {
            while (A[i] > 0) {
                end++;
                cumulative += A[i];
                subElements++;
                i++;
            }
            if (A[i] < 0) {
                if (cumulative > maxSum) {
                    maxSum = cumulative;
                    maxElements = subElements;
                } else if ((cumulative == maxSum) && subElements > maxElements ) {
                    maxSum = cumulative;
                    maxElements = subElements;
                } else if ((cumulative == maxSum) && subElements == maxElements){

                }
                start = end + 1;
                end = start;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(){{add(1); add(2); add(3); add(4);}};
        ArrayList<Integer> list2 = new ArrayList<Integer>(){{add(5); add(6); add(7); add(8);}};
        ArrayList<Integer> list3 = new ArrayList<Integer>(){{add(9); add(10); add(11); add(12);}};
        ArrayList<Integer> list4 = new ArrayList<Integer>(){{add(13); add(14); add(15); add(16);}};
        List<ArrayList<Integer>> metrix = new ArrayList<>();
        metrix.add(list1);
        metrix.add(list2);
        metrix.add(list3);
        metrix.add(list4);
//        System.out.println(Arrays.toString(rotateArray(list, 2).toArray()));
//        System.out.println(Arrays.toString(spiralOrder(metrix).toArray()));
        ArrayList<Integer> xCoordinate = new ArrayList<Integer>(){{add(0); add(1); add(1); }};
        ArrayList<Integer> yCoordinate = new ArrayList<Integer>(){{add(0); add(1); add(2); }};

        System.out.println(coverPoints(xCoordinate, yCoordinate));
    }
}
