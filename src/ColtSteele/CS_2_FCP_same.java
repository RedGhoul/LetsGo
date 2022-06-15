package ColtSteele;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CS_2_FCP_same {
    public static void main(String[] args){
        System.out.println(same(new int[]{1,2,3},new int[]{4,1,9}));
        System.out.println(same(new int[]{1,2,3},new int[]{1,9}));
        System.out.println(same(new int[]{1,2,2},new int[]{4,4,1}));

    }

    /**
     * Could have used two hashmaps instead of 1. But using only one is space effienct
     * Time complexity is O(N)
     * Space complexity is also O(N)
     *
     * **/
    public static boolean same(int[] inputNoS, int[] input2S){
        if(inputNoS.length != input2S.length) return false;
        HashMap<Integer, Integer> bag = new HashMap<>();
        for(int i = 0; i < inputNoS.length; i++){
            Integer key = inputNoS[i] * inputNoS[i];
            if(bag.containsKey(key)){
                bag.put(key, bag.get(key)+1);
            }else{
                bag.put(key, 1);
            }
        }

        for(int i = 0; i < input2S.length; i++){
            Integer key = input2S[i];
            if(bag.containsKey(key)){
                bag.put(key, bag.get(key)-1);
            }else{
                return false;
            }
        }

        for(Map.Entry<Integer,Integer> entry: bag.entrySet()){
            if(entry.getValue() < 0 || entry.getValue() > 0){
                return false;
            }
        }
        return true;
    }
}
