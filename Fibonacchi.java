package DynamicProgramming;

public class Fibonacchi {

    //brute-force
    static int fib(int n) {
        if (n == 0 || n== 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    //DP
    static int fibDP(int n) {
        int[] fibArray = new int[n+1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <=n; i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }

        return fibArray[n];
    }

    public static void main(String[] args) {
        System.out.print(fibDP(5));
    }
}
