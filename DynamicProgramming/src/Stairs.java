public class Stairs {

    public int climbStairs(int A) {
        return fibDP(A+1);
    }

    public int fibDP(int n) {
        int[] fibArray = new int[n+1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <=n; i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }

        return fibArray[n];
    }
}
