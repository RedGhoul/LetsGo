package ColtSteele;

public class CS_12_5_Recur_reverse_string {
    public static void main(String[] args){
        System.out.println(reverse("awesome"));
        System.out.println(reverse("rithmschool"));
    }

    public static String reverse(String input){
        if(input.isEmpty()) return "";

        return reverseHelper(input);
    }

    public static String reverseHelper(String input){
        if(input.isEmpty()) return "";
        return input.substring(input.length()-1) +
                reverseHelper(input.substring(0,input.length()-1));
    }
}
