package StephenGrider;

import java.util.LinkedList;
import java.util.Queue;

public class SG_17_Weave_Queue {
    public static void main(String[] args){
        Queue<String> finalQueue1 = new LinkedList<>();
        finalQueue1.add("A");
        finalQueue1.add("B");
        finalQueue1.add("C");
        finalQueue1.add("D");
        finalQueue1.add("E");
        Queue<String> finalQueue2 = new LinkedList<>();
        finalQueue2.add("A2");
        finalQueue2.add("B2");
        finalQueue2.add("C2");
        finalQueue2.add("D2");
        Queue<String> finalQueue22 = weave(finalQueue1, finalQueue2);
        System.out.println(finalQueue22);
    }

    public static Queue<String> weave(Queue<String> qq1, Queue<String> qq2){
        if(qq1.isEmpty()) return qq2;
        if(qq2.isEmpty()) return qq1;
        if(qq1 == null && qq2 == null) return null;
        if(qq1.isEmpty() && qq2.isEmpty()) return null;

        Queue<String> finalQueue = new LinkedList<>();

        while(!qq1.isEmpty() && !qq2.isEmpty()){
            String q1 = qq1.remove();
            finalQueue.add(q1);
            String q2 = qq2.remove();
            finalQueue.add(q2);
        }
        while (!qq1.isEmpty()) {
            String q2 = qq1.remove();
            finalQueue.add(q2);
        }
        while (!qq2.isEmpty()) {
            String q2 = qq2.remove();
            finalQueue.add(q2);
        }
        return finalQueue;
    }
}
