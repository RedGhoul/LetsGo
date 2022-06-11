package StephenGrider;

public class SG_31_Contains_BinaryTree {
    public static void main(String[] args){

    }
//700. Search in a Binary Search Tree
    public static boolean contains(SG_29_Binary_Tree_Node tree, SG_29_Binary_Tree_Node find){
        if(tree == null) return false;
        if(find.data > tree.data){
            contains(tree.right,find);
        } else if (find.data < tree.data) {
            // have to put the returns here if your actually returning
            // something due to the fact that after the final recursive
            // call finishes, it will try to finish the other calls left in the
            // stack
            contains(tree.left,find);
        }
        return true;
    }
}
