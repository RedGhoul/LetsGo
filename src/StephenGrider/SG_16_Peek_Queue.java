package StephenGrider;

import java.util.ArrayList;

public class SG_16_Peek_Queue {
    // --- Description
    // Create a queue data structure.  The queue
    // should be a class with methods 'add' and 'remove'.
    // Adding to the queue should store an element until
    // it is removed
    // --- Examples
    //     const q = new Queue();
    //     q.add(1);
    //     q.remove(); // returns 1;
    // I am just going to use an array list for this one.
    // start of the arraylist is the beginning of the queue
    // end of the arraylist is the end of the queue
    public static void main(String[] args){
        SG_15_Create_Queue ss = new SG_15_Create_Queue();
        for(int i =0; i < 20; i++){
            ss.add(i);
        }

        for(int i =0; i < 20; i++){
            System.out.println(ss.remove());
        }
    }

    private ArrayList<Integer> inner;

    public SG_16_Peek_Queue(){
        inner = new ArrayList<>();
    }

    public void add(int input){
        inner.add(0,input);
    }

    public int remove(){
        return inner.remove(inner.size()-1);
    }

    //SG_16_
    public int peek(){
        return inner.get(inner.size()-1);
    }
}
