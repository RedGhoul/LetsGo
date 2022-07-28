package JosePortilla;

public class JP_Array_Unique_Chars_In_String {
    public static void main(String[] args){
        System.out.println(uni_chars(""));
        System.out.println(uni_chars("goo"));
        System.out.println(uni_chars("abcdefg"));
    }
    // can also use a set for this
    // can just compare the size of the set to the size of the string
    public static boolean uni_chars(String input){
        if(input == null) return false;
        char[] allCharMap = new char[Character.MAX_VALUE];
        char[] inputArr = input.toCharArray();
        for(int i = 0; i < inputArr.length; i++){
            char curChar = inputArr[i];
            if(allCharMap[curChar] == 1){
                return false;
            }else{
                allCharMap[curChar] = 1;
            }
        }
        return true;
    }
}
