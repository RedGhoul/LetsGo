package StephenGrider;

import java.util.HashMap;
import java.util.Locale;

public class SG_7_Anagrams {
    // --- Directions
    // Check to see if two provided strings are anagrams of eachother.
    // One string is an anagram of another if it uses the same characters
    // in the same quantity. Only consider characters, not spaces
    // or punctuation.  Consider capital letters to be the same as lower case
    // --- Examples
    //   anagrams('rail safety', 'fairy tales') --> True
    //   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
    //   anagrams('Hi there', 'Bye there') --> False
    public static void main(String[] args){
        System.out.println(anagramCheck("rail safety", "fairy tales"));
        System.out.println(anagramCheck("RAIL! SAFETY!", "fairy tales"));
        System.out.println(anagramCheck("Hi there", "Bye there"));
    }

    public static boolean anagramCheck(String string1, String string2){
        if(string1 == null || string2 == null) return false;
        string1 = string1.toLowerCase(Locale.ROOT);
        string2 = string2.toLowerCase(Locale.ROOT);
        HashMap<Character,Integer> bag = new HashMap<>();

        for(int i =0; i<string1.length();i++){
            Character curChar = string1.charAt(i);
            if(!Character.isLetter(curChar)) continue;
            if(bag.containsKey(curChar)){
                bag.put(curChar, bag.get(curChar)+1);
            }else{
                bag.put(curChar,1);
            }
        }
        for(int i = 0; i<string2.length();i++){
            Character curChar = string2.charAt(i);
            if(!Character.isLetter(curChar)) continue;
            if(bag.containsKey(curChar)){
                bag.put(curChar, bag.get(curChar)-1);
            }else{
                return false;
            }
        }
        for(Integer cur: bag.values()){
            if(cur > 0){
                return false;
            }
        }
        return true;
    }

}
