package StephenGrider;

public class SG_0_Fizz_Buzz {
    public static void main(String[] args){
        //the value here (101) will always go to its self minus one
        for(int i = 1; i < 101; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 4 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
