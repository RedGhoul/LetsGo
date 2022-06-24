package ColtSteele;

public class CS_12_6_Recur_isPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("awesome"));
        System.out.println(isPalindrome("foobar"));
        System.out.println(isPalindrome("tacocat"));
        System.out.println(isPalindrome("amanaplanacanalpanama"));
        System.out.println(isPalindrome("amanaplanacanalpandemonium"));
    }

    /**
     * Not really thinking about special chars in here
     *
     * **/
    public static boolean isPalindrome(String input){
        if(input.isEmpty()) return false;

        return reverseHelper(input.toCharArray(), 0, input.length()-1);
    }

    public static boolean reverseHelper(char[] input, int start, int end){
        if(start < end && input[start] == input[end]){
            start++;
            end--;
            return true && reverseHelper(input,start,end);
        }else if(start+1 == end || start == end){
            return true;
        }
        return false;
    }
}
