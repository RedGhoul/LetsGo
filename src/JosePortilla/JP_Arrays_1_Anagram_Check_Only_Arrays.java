package JosePortilla;

import java.util.Locale;

public class JP_Arrays_1_Anagram_Check_Only_Arrays {

    public static void main(String[] args){
        System.out.println(isAnagram("public relations","crap built on lies"));
        System.out.println(isAnagram("public relations","crap"));
    }

    // anagram check - again we have done this
    // doing this now without touching a map ?
    // lol the guy does it with a map
    // Time Complexity: linear time - O(n)
    // Space Complexity: O(n)
    public static boolean isAnagram(String input1, String input2) {
        // if statements always get evaluated left to right
        // so this statement will still make sense
        if(input1 == null || input2 == null){
                //input1.length() != input2.length()){ don't need this since you
        // could have punctuation
            return false;
        }
        // did not know there was a max to this, that was a constant
        int[] arrayMap = new int[Character.MAX_VALUE];
        char[] input1Ar = input1.toLowerCase(Locale.ROOT).toCharArray();
        char[] input2Ar = input2.toLowerCase(Locale.ROOT).toCharArray();
        for(int i = 0; i < input1Ar.length; i++){
            char curVal = input1Ar[i];
            if(Character.isLetter(curVal)){
                int curIndex = (int)input1Ar[i];
                if(arrayMap[curIndex] > 0){
                    arrayMap[curIndex] = arrayMap[curIndex] + 1;
                }else{
                    arrayMap[curIndex] = 1;
                }
            }
        }

        for(int i = 0; i < input2Ar.length; i++){
            char curVal = input2Ar[i];
            if(Character.isLetter(curVal)){
                int curIndex = (int)input2Ar[i];
                if(arrayMap[curIndex] > 0){
                    arrayMap[curIndex] = arrayMap[curIndex] - 1;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < arrayMap.length; i++){
            count = count + arrayMap[i];
        }

        return count == 0;
    }
}
