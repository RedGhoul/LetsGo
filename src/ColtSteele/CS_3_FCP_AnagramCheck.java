package ColtSteele;

import java.util.HashMap;
import java.util.Map;

public class CS_3_FCP_AnagramCheck {
    public static void main(String[] args){
        System.out.println(isAnagram("",""));
        System.out.println(isAnagram("aaz","zza"));
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
        System.out.println(isAnagram("awesome","awesom"));
        System.out.println(isAnagram("qwerty","qeywrt"));
        System.out.println(isAnagram("texttwisttime","timetwisttext"));
    }

    /**
     * Could have used two hashmaps instead of 1. But using only one is space effienct
     * Time complexity is O(N)
     * Space complexity is also O(N)
     * Not thinking about , spacing, special chars, and
     * numbers. Just assuming that everything is word made of
     * up standard characters
     * **/
    public static boolean isAnagram(String input1, String input2){
        if(input1.length() != input2.length()) return false;
        char[] input1a = input1.toCharArray();
        char[] input2a = input2.toCharArray();
        HashMap<Character, Integer> bag = new HashMap<>();
        for(int i = 0; i < input1a.length; i++){
            char key = input1a[i];
            if(bag.containsKey(key)){
                bag.put(key, bag.get(key)+1);
            }else{
                bag.put(key, 1);
            }
        }

        for(int i = 0; i < input2a.length; i++){
            char key = input2a[i];
            if(bag.containsKey(key)){
                bag.put(key, bag.get(key)-1);
            }else{
                return false;
            }
        }

        for(Map.Entry<Character,Integer> entry: bag.entrySet()){
            if(entry.getValue() < 0 || entry.getValue() > 0){
                return false;
            }
        }
        return true;
    }
}
