package ColtSteele;

import java.util.ArrayList;
import java.util.Arrays;

public class CS_24_MaxBinaryHeap {
    /**
     * Basically just need to know two formulas
     * Parent to child: n*2 + 1
     * Child to parent: (n-1)/2
     *
     * **/
    public static void main(String[] args){
        CS_24_MaxBinaryHeap hee = new CS_24_MaxBinaryHeap();
        hee.list = new ArrayList<>(Arrays.asList(41,39,33,18,27,12));
        hee.Insert(55);
        System.out.println(Arrays.toString(hee.list.toArray()));
        hee.ExtractMax();
        System.out.println(Arrays.toString(hee.list.toArray()));
    }

    public ArrayList<Integer> list = new ArrayList<>();

    public void Insert(int input){
        this.list.add(input);
        bubbleUp();
    }

    public int ExtractMax(){
        int removed = this.list.remove(0);
        if(this.list.size() > 0){
            int endValue = this.list.remove(this.list.size()-1);
            this.list.add(0,endValue);
            bubbleDown();
        }
        return removed;
    }

    private void bubbleDown() {
        int currentIndex = 0;
        int currentValue = this.list.get(currentIndex);

        while(true){
            int leftIndex = getChildLeft(currentIndex);
            int rightIndex = getChildRight(currentIndex);
            if(leftIndex > this.list.size()-1 && rightIndex > this.list.size()-1){
                return;
            }
            if(leftIndex <= this.list.size()-1 && rightIndex > this.list.size()-1){
                int currLeft = this.list.get(leftIndex);
                if(currLeft > currentValue){
                    this.list.set(currentIndex, currLeft);
                    this.list.set(leftIndex, currentValue);
                    currentIndex = leftIndex;

                }
                return;
            }

            int currLeft = this.list.get(leftIndex);
            int currRight = this.list.get(rightIndex);
            if(currLeft > currRight && currLeft > currentValue){
                this.list.set(currentIndex, currLeft);
                this.list.set(leftIndex, currentValue);
                currentIndex = leftIndex;
                continue;
            }
            if(currRight > currLeft && currRight > currentValue){
                this.list.set(currentIndex, currRight);
                this.list.set(rightIndex, currentValue);
                currentIndex = rightIndex;
                continue;
            }
            if(currentValue > currLeft && currentValue > currRight){
                return;
            }
        }
    }

    private void bubbleUp() {
        int currentIndex = this.list.size()-1;
        int currentValue = this.list.get(currentIndex);
        while(currentIndex >= 0){
            int parentIndex = getParentIndex(currentIndex);
            int parentValue = this.list.get(parentIndex);
            if(currentValue > parentValue){
                this.list.set(parentIndex, currentValue);
                this.list.set(currentIndex, parentValue);
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
