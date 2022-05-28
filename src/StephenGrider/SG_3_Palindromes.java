package StephenGrider;

public class SG_3_Palindromes {
    // --- Directions
    // Given a string, return true if the string is a palindrome
    // or false if it is not.  Palindromes are strings that
    // form the same word if it is reversed. *Do* include spaces
    // and punctuation in determining if the string is a palindrome.
    // --- Examples:
    //   palindrome("abba") === true
    //   palindrome("abcdefg") === false
    public static void main(String[] args){
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abcdefg"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(null));
    }

    public static boolean isPalindrome(String input){
        if(input == null || input.isEmpty()) return false;
        if(input.length() == 1) return true;
        char[] inputChars = input.toCharArray();
        int p1 = 0;
        int p2 = input.length() -1;
        while(p1 <= p2){
            if(inputChars[p1] != inputChars[p2]){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
