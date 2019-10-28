import java.util.ArrayList;
import java.util.HashMap;

public class Equal {

    public ArrayList<Integer> equal(ArrayList<Integer> A) {
        if (A.size() < 4){
            return new ArrayList<>();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        for (Integer number : A) {
            if (!map.containsKey(number)){
                map.put(number, i);
            }
            i++;
        }

        for (Object o : map.keySet()) {
            for (Object p : map.keySet()){

            }

        }


        return new ArrayList<>();
    }
}
