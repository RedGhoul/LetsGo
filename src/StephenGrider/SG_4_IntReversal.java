package StephenGrider;

public class SG_4_IntReversal {
    // --- Directions
    // Given an integer, return an integer that is the reverse
    // ordering of numbers.
    // --- Examples
    //   reverseInt(15) === 51
    //   reverseInt(981) === 189
    //   reverseInt(500) === 5
    //   reverseInt(-15) === -51
    //   reverseInt(-90) === -9
    // gonna ram this through, but need to come back to the mathy way of doing it
    public static void main(String[] args){
        System.out.println(reverseInt(15));
        System.out.println(reverseInt(981));
        System.out.println(reverseInt(500));
        System.out.println(reverseInt(-15));
        System.out.println(reverseInt(-90));
        System.out.println(reverseInt(-0));
    }

    public static int reverseInt(int input){
        String intInput = Integer.toString(input);
        char[] intInputArr = intInput.toCharArray();
        String output = "";
        for(int i =intInput.length()-1; i >= 0; i--){
            if(intInputArr[i] == '-'){
                output = "-" + output;
            }else{
                output = output + intInputArr[i];
            }
        }
        return Integer.parseInt(output);
    }
}
