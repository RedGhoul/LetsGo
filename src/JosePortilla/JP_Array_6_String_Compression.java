package JosePortilla;

public class JP_Array_6_String_Compression {
    /**
     * Given a string in the form 'AAAABBBBCCCCCDDEEEE' compress it to become 'A4B4C5D2E4'.
     * For this problem, you can falsely "compress" strings of single or double letters.
     * For instance, it is okay for 'AAB' to return 'A2B1' even though this technically
     * takes more space.
     *
     * The function should also be case sensitive, so that a string 'AAAaaa' returns 'A3a3'.
     * **/

    public static void main(String[] args){
        System.out.println(compress("AAAAABBBBCCCC"));
        System.out.println(compress("AABBCC"));
        System.out.println(compress("AAABCCDDDDD"));
    }

    public static String compress(String input){
        if(input == null || input.isEmpty() || input.isBlank()) return "";
        String finalAnswer = "";
        char[] inputArray = input.toCharArray();
        char curChar = inputArray[0];
        int curCount = 1;
        if(inputArray.length == 1){
            return String.valueOf(curChar) + 1;
        }
        for(int i = 1; i < inputArray.length; i++){
            char indexChar = inputArray[i];
            if(indexChar == curChar){
                curCount++;
            } else {
                finalAnswer = finalAnswer + String.valueOf(curChar) + curCount;
                curCount = 1;
                curChar = indexChar;
            }
        }
        finalAnswer = finalAnswer + String.valueOf(curChar) + curCount;// for the very last case
        return finalAnswer;
    }
}
