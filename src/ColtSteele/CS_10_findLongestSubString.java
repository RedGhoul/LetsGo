package ColtSteele;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CS_10_findLongestSubString {
    /**
     * Exactly what you think it is
     * accepts and string and returns
     * the longest sub string with all distinct chars
     * lol I forgot about this joke problem, even though it comes under the
     * sliding window problem, You still have to use a set.
     * I thought we were only supposed to use pointers
     * **/

    public static void main(String[] args){
        System.out.println(findLongest("rithmschool"));
        System.out.println(findLongest("thisisawesome"));
        System.out.println(findLongest("thecatinthehat"));
        System.out.println(findLongest("bbbbbbbb"));
        System.out.println(findLongest("longestsubstring"));
        System.out.println(findLongest("thisishowwedoit"));
    }

    public static int findLongest(String input){
        if(input.isEmpty()) return 0;
        if(input.length() == 1) return 1;
        int maxLong = Integer.MIN_VALUE;
        char[] inputA = input.toCharArray();
        HashMap<Character, Integer> bag = new HashMap<>();
        int start = 0;
        for (int i = 0; i < inputA.length; i++) {
            char curVal = inputA[i];
            if (bag.containsKey(curVal)) {
                start = Math.max(bag.get(curVal)+1,start);
            }
            maxLong = Math.max(i - start, maxLong);
            bag.put(curVal,i);
        }

        return maxLong + 1;
    }

    public static int findLongestSubString(String input){
        if(input.isEmpty()) return 0;
        if(input.length() == 1) return 1;
        int maxLong = Integer.MIN_VALUE;
        char[] inputA = input.toCharArray();
        int start = 0;
        for(int i = 1; i < inputA.length; i++){
            if(!isUnique(inputA,start, i)){
                int curLen = i - start;
                if(curLen > maxLong){
                    maxLong = curLen;
                }
                start = i;
            }
        }
        return maxLong;
    }

    public static boolean isUnique(char[] input,int start, int checkValIndex){
        for(int i = start; i < checkValIndex-1; i++){
            if(input[i] == input[checkValIndex])return false;
        }
        return true;
    }
}
