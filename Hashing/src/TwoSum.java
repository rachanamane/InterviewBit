import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

     static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int i= 1;
        for (Integer number: A) {
            if (map.containsKey(B - number)){
                result.add(map.get(B - number));
                result.add(i);
                return result;
            }
            if (!map.containsKey(number)){
                map.put(number,i);
            }
            i++;
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(-4);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(-5);
        System.out.println(twoSum(list,-3));
    }

}
