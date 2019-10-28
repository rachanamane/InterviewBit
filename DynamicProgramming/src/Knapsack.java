public class Knapsack {

    static int knapSack(int W, int[] wt, int[] val, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n-1] > W) {
            return knapSack(W,wt,val,n-1);
        } else {
            return Math.max(val[n-1] + knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));
        }
    }

    //Catalan numbers
    static int knapSackDP(int W, int[] wt, int[] val, int n) {

        int K[][] = new int[n+1][W+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    K[i][j] = 0;
                } else if (wt[i-1] <= j) {
                    K[i][j] = Math.max(val[i-1] + K[i-1][j-wt[i-1]], K[i-1][j]);
                } else {
                    K[i][j] = K[i-1][j];
                }
            }
        }

        return K[n][W];
    }

    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W,wt,val,n));
        System.out.print(knapSackDP(W,wt,val,n));
    }
}
