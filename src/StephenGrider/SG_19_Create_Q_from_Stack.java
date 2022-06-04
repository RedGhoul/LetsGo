package StephenGrider;

import java.util.Queue;
import java.util.Stack;

public class SG_19_Create_Q_from_Stack {
    public static void main(String[] args){
        SG_19_Create_Q_from_Stack ss = new SG_19_Create_Q_from_Stack();
        for(int i =0; i < 20; i++){
            ss.add(String.valueOf(i));
        }

        for(int i =0; i < 20; i++){
            ss.add("asdf");
            System.out.println(String.valueOf(ss.remove()));
        }
        System.out.println(String.valueOf(ss.remove()));
    }

    private Stack<String> Start;
    private Stack<String> End;

    public SG_19_Create_Q_from_Stack(){
        Start = new Stack<>();
        End = new Stack<>();
    }

    public void add(String input){
        if(Start.isEmpty() && !End.isEmpty()){
            transfer(End,Start);
        }
        Start.add(input);
    }


    public String peek(){
        if(End.isEmpty() && !Start.isEmpty()){
            transfer(Start,End);
        }
        return End.peek();
    }

    public String remove(){
        if(End.isEmpty() && !Start.isEmpty()){
            transfer(Start,End);
        }
        return End.pop();
    }

    private void transfer(Stack<String> input, Stack<String> output){
        while(!input.isEmpty()){
            String ss = input.pop();
            output.add(ss);
        }
    }
}
