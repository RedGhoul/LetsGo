package StephenGrider;

public class SG_2_ReverseString {
    /**
     * Given a string, return a new string with reversed order of characters.
     * There are a lot of ways to do this
     * */
    public static void main(String[] args){
        System.out.println(reverse("apple"));
        System.out.println(reverse("hello"));
        System.out.println(reverse("Greetings!"));
        System.out.println(reverse(""));
        System.out.println(reverse("G"));
        System.out.println(reverse("GH"));
        System.out.println("-------------------------");
        System.out.println(reverse2("apple"));
        System.out.println(reverse2("hello"));
        System.out.println(reverse2("Greetings!"));
        System.out.println(reverse2(""));
        System.out.println(reverse2("G"));
        System.out.println(reverse2("GH"));
    }
    /**
     * Could append to a new string in reverse order
     * Could append to a new string in reverse order but without starting from the back
     * instead just making the first thing go last
     * Could convert to array - use double pointer - switch places
     * Didn't consider the case about non-alphanumeric chars
     * and upper case and lower case
     * */
    public static String reverse(String input){
        if(input == null || input.isEmpty()) return "";
        String newOut = "";
        for(int i =input.length()-1; i >=0; i--){
            newOut = newOut + String.valueOf(input.charAt(i));
        }
        return newOut;
    }

    public static String reverse2(String input){
        if(input == null || input.isEmpty()) return "";
        if(input.length() == 1) return input;
        char[] inputArray = input.toCharArray();
        int p1 = 0;
        int p2 = inputArray.length-1;
        while (p2 > p1) {
            char init = inputArray[p1];
            char end = inputArray[p2];
            inputArray[p1] = end;
            inputArray[p2] = init;
            p1++;
            p2--;
        }
        return String.copyValueOf(inputArray);
    }
}
