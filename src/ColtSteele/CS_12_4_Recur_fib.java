package ColtSteele;

public class CS_12_4_Recur_fib {
    public static void main(String[] args){
        System.out.println(fib(4));
        System.out.println(fib(10));
        System.out.println(fib(28));
        System.out.println(fib(35));
    }
    public static int fib(int input){
        if(input == 1) return 1;
        if(input == 0) return 0;
        return  fib(input-2) + fib(input-1);
    }
}
