package StephenGrider;

import java.util.ArrayList;

public class SG_18_Create_Stack {
    // --- Directions
    // Create a stack data structure.  The stack
    // should be a class with methods 'push', 'pop', and
    // 'peek'.  Adding an element to the stack should
    // store it until it is removed.
    // --- Examples
    //   const s = new Stack();
    //   s.push(1);
    //   s.push(2);
    //   s.pop(); // returns 2
    //   s.pop(); // returns 1
    public static void main(String[] args){

    }

    ArrayList<Integer> inner;

    public SG_18_Create_Stack(){
        inner = new ArrayList<>();
    }

    public void push(int input){
        inner.add(input);
    }

    public int pop(){
        return inner.remove(inner.size()-1);
    }
}
