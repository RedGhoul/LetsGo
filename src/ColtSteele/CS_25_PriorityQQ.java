package ColtSteele;

import java.util.ArrayList;
import java.util.List;

class pNode {
    public pNode left;
    public pNode right;
    public int priority;
    public String value;
}
// lower number = higher priority
public class CS_25_PriorityQQ {
    public List<pNode> nodes = new ArrayList<>();
    public static void main(String[] args){

    }

    public void enqueue(String value, int priority){
        pNode node = new pNode();
        node.value = value;
        node.priority = priority;
        nodes.add(node);
        bubbleUp();
    }

    public void dequeue(String value, int priority){
        pNode node = new pNode();
        node.value = value;
        node.priority = priority;
    }

    private void bubbleDown() {
        int currentIndex = 0;
        pNode currentValue = this.nodes.get(currentIndex);

        while(true){
            int leftIndex = getChildLeft(currentIndex);
            int rightIndex = getChildRight(currentIndex);

            if(leftIndex > this.nodes.size()-1 && rightIndex > this.nodes.size()-1){
                return;
            }

            if(leftIndex <= this.nodes.size()-1 && rightIndex > this.nodes.size()-1){
                pNode currLeft = this.nodes.get(leftIndex);
                if(currLeft.priority < currentValue.priority){
                    this.nodes.set(currentIndex, currLeft);
                    this.nodes.set(leftIndex, currentValue);
                    currentIndex = leftIndex;
                }
                return;
            }

            pNode currLeft = this.nodes.get(leftIndex);
            pNode currRight = this.nodes.get(rightIndex);
            if(currLeft.priority < currRight.priority && currLeft.priority < currentValue.priority){
                this.nodes.set(currentIndex, currLeft);
                this.nodes.set(leftIndex, currentValue);
                currentIndex = leftIndex;
                continue;
            }
            if(currRight.priority < currLeft.priority &&
                    currRight.priority > currentValue.priority){
                this.nodes.set(currentIndex, currRight);
                this.nodes.set(rightIndex, currentValue);
                currentIndex = rightIndex;
                continue;
            }
            if(currentValue.priority < currLeft.priority &&
                    currentValue.priority < currRight.priority){
                return;
            }
        }
    }
    private void bubbleUp() {
        int currentIndex = this.nodes.size()-1;
        pNode currentValue = this.nodes.get(currentIndex);
        while(currentIndex >= 0){
            int parentIndex = getParentIndex(currentIndex);
            pNode parentValue = this.nodes.get(parentIndex);
            if(currentValue.priority < parentValue.priority){
                this.nodes.set(parentIndex, currentValue);
                this.nodes.set(currentIndex, parentValue);
                currentIndex = parentIndex;
            }else{
                return;
            }
        }
    }

    public static int getParentIndex(int index){
        return (int)Math.floor((index-1)/2);
    }

    public static int getChildLeft(int index){
        return (index*2)+1;
    }
    public static int getChildRight(int index){
        return (index*2)+2;
    }
}
