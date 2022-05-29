package StephenGrider;

import java.util.Locale;

public class SG_8_SentenceCapitalization {
    // --- Directions
    // Write a function that accepts a string.  The function should
    // capitalize the first letter of each word in the string then
    // return the capitalized string.
    // --- Examples
    //   capitalize('a short sentence') --> 'A Short Sentence'
    //   capitalize('a lazy fox') --> 'A Lazy Fox'
    //   capitalize('look, it is working!') --> 'Look, It Is Working!'

    public static void main(String[] args){
        System.out.println(cap("a short sentence"));
        System.out.println(cap("a lazy fox"));
        System.out.println(cap("look, it is working!"));
        System.out.println(cap("lo"));
        System.out.println(cap("o"));
    }

    public static String cap(String input){
        if(input == null || input.isEmpty()) return "";
        if(input.length() == 1) return input.toUpperCase(Locale.ROOT);
        String[] arr = input.split(" ");
        for(int i = 0; i < arr.length; i++){
            String rest = arr[i].substring(1);
            String start = arr[i].substring(0,1).toUpperCase();
            arr[i] = start+rest;
        }
        return String.join(" ",arr);
    }
}
