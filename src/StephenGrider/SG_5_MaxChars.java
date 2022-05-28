package StephenGrider;

import java.util.HashMap;
import java.util.Map;

public class SG_5_MaxChars {
    // --- Directions
    // Given a string, return the character that is most
    // commonly used in the string.
    // --- Examples
    // maxChar("abcccccccd") === "c"
    // maxChar("apple 1231111") === "1"
    // There is a way to do this with an array, and converting each string
    // letter into a char, and using that as an index. But I am too
    // Lazy today, so I am, just going to use the classic hashmap.
    public static void main(String[] args){
        System.out.println(findMaxChar("abcccccccd"));
        System.out.println(findMaxChar("apple 1231111"));
        System.out.println(findMaxChar(""));
    }

    public static String findMaxChar(String input){
        if(input == null || input.isEmpty()) return "";
        HashMap<Character,Integer> bag = new HashMap<>();
        for(int i = 0; i < input.length(); i++){
            Character curChar = input.charAt(i);
            if(bag.containsKey(curChar)){
                bag.put(curChar, bag.get(curChar)+1);
            }else {
                bag.put(curChar,1);
            }
        }
        int maxVal = Integer.MIN_VALUE;
        String maxStr = "";
        for(Map.Entry<Character,Integer> entry: bag.entrySet()){
            if(entry.getValue() > maxVal){
                maxVal = entry.getValue();
                maxStr = String.valueOf(entry.getKey());
            }
        }
        return maxStr;
    }
}
