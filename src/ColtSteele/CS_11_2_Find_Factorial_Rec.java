package ColtSteele;

public class CS_11_2_Find_Factorial_Rec {

    public static void main(String[] args){
        System.out.println(findFactorial(1)); //1
        System.out.println(findFactorial(7)); // 5040
        System.out.println(findFactorial(10)); //3628800
    }

    public static int findFactorial(int input){
        if(input == 1) return 1;
        return input * findFactorial(input-1);
    }
}
