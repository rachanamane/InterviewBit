import java.util.*;

public class GenerateParantheses {

    public static ArrayList<String> generateParantheses(int n){
        ArrayList<String> result =new ArrayList<>();
        helper(n,0,"",result);
        Collections.sort(result);
        return result;

    }

    public static void helper(int open, int close, String str, ArrayList<String> arr) {
        if (open == 0 && close ==0) {
            arr.add(str);
        }
        if (open > 0) {
            helper(open -1,close +1 , str + "(" , arr);
        }
        if (close > 0) {
            helper(open,close-1, str + ")", arr);
        }
    }



    public static void main(String[] args) {
            System.out.println( generateParantheses(4).size());


    }


}