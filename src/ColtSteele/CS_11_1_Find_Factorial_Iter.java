package ColtSteele;

public class CS_11_1_Find_Factorial_Iter
{
    public static void main(String[] args){
        System.out.println(findFactorial(1)); //1
        System.out.println(findFactorial(7)); // 5040
        System.out.println(findFactorial(10)); //3628800
    }
    /**
     * Always do your test cases, before running your code
     * **/
    public static int findFactorial(int input){
        int answer = 1;
        for(int i =1; i <= input; i++){
            answer = answer * i;
        }
        return answer;
    }
}
