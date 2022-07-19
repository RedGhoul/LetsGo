package JosePortilla;

import java.util.*;

public class JP_Array_2_Array_Pair_Sum {
    public static void main(String[] args){
        List<List<Integer>> answer = ArrayPairSum2(Arrays.asList(1,3,2,2), 4);
        for(List<Integer> lis: answer){
            System.out.println(Arrays.toString(lis.toArray()));
        }

    }

    public static List<List<Integer>> ArrayPairSum(List<Integer> input, int k){
        if(input == null || input.isEmpty()) return new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Set<List<Integer>> answer = new HashSet<>();
        for(int i = 0; i < input.size(); i++){
            int key = k - input.get(i);
            map.put(key, input.get(i));
            if(map.containsKey(input.get(i))){
                answer.add(new ArrayList<>(Arrays.asList(key,input.get(i))));
            }
        }

        return answer.stream().toList();
    }

    public static List<List<Integer>> ArrayPairSum2(List<Integer> input, int k){
        if(input == null || input.isEmpty()) return new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Set<String> val = new HashSet<>();
        /**
         * I guess if you didn't want this list of lists you can
         * go over the set of strings and parse out the values
         * into a list of lists
         * **/
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < input.size(); i++){
            int key = k - input.get(i);
            map.put(key, input.get(i));
            String keyS = key + "+" + input.get(i);
            if(map.containsKey(input.get(i)) && !val.contains(keyS)){
                answer.add(new ArrayList<>(Arrays.asList(key,input.get(i))));
                val.add(keyS);
            }
        }
        return answer;
    }

    /**
     *
     * for num in arr:
     *  target = k - num
     *  don't need to add the whole relationship here
     *  Cause once you have a target that has been seen, then you know
     *  that there are two things that add up to "k"
     *  Once that happens you already know that
     *  target + num = k
     *  so now you just put the pair in a set
     *  if target not in seen:
     *      seen.add(num)
     *  else:
     *      output.add((
     *
     *
     *
     * **/
}
