package StephenGrider;

public class SG_11_vowels {
    // --- Directions
    // Write a function that returns the number of vowels
    // used in a string.  Vowels are the characters 'a', 'e'
    // 'i', 'o', and 'u'.
    // --- Examples
    //   vowels('Hi There!') --> 3
    //   vowels('Why do you ask?') --> 4
    //   vowels('Why?') --> 0
    // really basic first way, but I guess the other way to do this
    // would be to use regex
    public static void main(String[] args){
        System.out.println(findVowels("Hi There!"));
        System.out.println(findVowels("Why do you ask?"));
        System.out.println(findVowels("Why?"));
    }

    public static int findVowels(String input){
        if(input == null || input.isEmpty()) return 0;
        char[] inputArr = input.toLowerCase().toCharArray();
        int count = 0;
        for(int i = 0; i < inputArr.length; i++){
            char curChar = inputArr[i];
            if(curChar == 'a'||curChar == 'e'||curChar == 'i'||curChar == 'o'||curChar == 'u'){
                count++;
            }
        }
        return count;
    }
}
