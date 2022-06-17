package ColtSteele;

public class CS_8_isSubsequence {
    /**
     * Given two string, see if the chars in the first
     * string exist in second string. With their order changing.
     *
     * O(n) time
     * O(1) space
     * **/
    public static void main(String[] args){
        System.out.println(isSubsequence("hello", "hello world"));
        System.out.println(isSubsequence("sing", "sting"));
        System.out.println(isSubsequence("abc", "abracadabra"));
        System.out.println(isSubsequence("abc", "acb"));
    }

    public static boolean isSubsequence(String input1, String input2){
        if(input1.isEmpty() || input1.length() > input2.length()) return false;
        int p1 = 0;
        for(int p2 = 0; p2 < input2.length(); p2++){
            char p1c = input1.charAt(p1);
            char p2c = input2.charAt(p2);
            if(p1 == input1.length()-1) return true;
            if(p1c == p2c){
                p1++;
            }

        }

        return false;
    }
}
