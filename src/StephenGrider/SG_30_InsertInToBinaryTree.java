package StephenGrider;

public class SG_30_InsertInToBinaryTree {
    public static void main(String[] args){

    }

    public static void insert(SG_29_Binary_Tree_Node BinHead, SG_29_Binary_Tree_Node insertNode){
        if(BinHead == null) return;

        if(insertNode.data > BinHead.data){
            if(BinHead.right != null){
                insert(BinHead.right,insertNode);
            }
            BinHead.right = insertNode;
            return;
        }
        if(insertNode.data < BinHead.data){
            if(BinHead.left != null){
                insert(BinHead.left,insertNode);
            }
            BinHead.left = insertNode;
            return;
        }
    }
}
