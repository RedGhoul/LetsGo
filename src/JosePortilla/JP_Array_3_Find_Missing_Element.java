package JosePortilla;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JP_Array_3_Find_Missing_Element {
    public static void main(String[] args){
        System.out.println(finder(Arrays.asList(5,5,7,7), Arrays.asList(5,7,7)));
        System.out.println(finder(Arrays.asList(1,2,3,4,5,6,7), Arrays.asList(3,7,2,1,4,6)));
        System.out.println(finder(Arrays.asList(9,8,7,6,5,4,3,2,1), Arrays.asList(9,8,7,5,4,3,2,1)));
    }
    // apparently there should be only one number missing always
    public static int finder(List<Integer> list1, List<Integer> list2){
        if(list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()){
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.size(); i++){
            int curVal = list1.get(i);
            if(map.containsKey(curVal)){
                map.put(curVal, map.get(curVal)+1);
            }else{
                map.put(curVal,1);
            }
        }

        for(int i = 0; i < list2.size(); i++){
            int curVal = list2.get(i);
            if(map.containsKey(curVal)){
                map.put(curVal, map.get(curVal)-1);
            }else{
                map.put(curVal,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() != 0) return entry.getKey();
        }

        return 0;
    }
}
