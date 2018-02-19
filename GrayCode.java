package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {

    public static ArrayList<Integer> grayCode(int a){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);

        for (int i = 0; i < a; i++){
            int inc = 1 << i;
            for (int j = arr.size()-1; j >=0; j--){
                arr.add(arr.get(j) + inc);
            }

        }
        return arr;
    }

    public static void main(String[] args){
        System.out.print(Arrays.toString(grayCode(3).toArray()));
    }
}
