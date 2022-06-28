package ColtSteele;

class BTNode{
    public int data;
    public BTNode left;
    public BTNode right;
    public BTNode(int data){
        this.data = data;
    }
}

public class CS_22_BinaryTree {
    /**
     * Time complexity - to find something is:
     * O(n) - because you might have a tree that is nothing but rights or lefts
     *
     * Space complexity -  to find something is:
     * O(n) - how much space you use depends on how many nodes you have
     * **/
    public static void main(String[] args){
        BTNode root = new BTNode(8);
        BTNode rootL1 = new BTNode(4);
        BTNode rootR1 = new BTNode(10);
        BTNode rootLL2 = new BTNode(2);
        BTNode rootLR2 = new BTNode(6);
        BTNode rootRR2 = new BTNode(20);
        root.left = rootL1;
        root.right = rootR1;
        rootL1.left = rootLL2;
        rootL1.right = rootLR2;
        rootR1.right = rootRR2;
        CS_22_BinaryTree tree = new CS_22_BinaryTree(root);
        tree.insert(100);
        tree.insert(1);
        tree.insert(7);


        tree.search(7);
        tree.search(99);
        tree.search(2);
        System.out.println(tree.root);
    }

    public BTNode root;
    public CS_22_BinaryTree(BTNode root){
        this.root = root;
    }

    /**
     * You traverse the tree structure the same way you
     * traversed it for the insert method
     *
     * **/
    public void search(int data){
        System.out.println(searchHelperRec(root, data));
        System.out.println(searchHelperIter(root, data));
    }

    public boolean searchHelperIter(BTNode root, int data){
        BTNode curNode = root;
        while(curNode != null){
            if(curNode.data == data) return true;
            if(data < curNode.data){
                curNode = curNode.left;
            }else{
                curNode = curNode.right;
            }
        }
        return false;
    }

    public boolean searchHelperRec(BTNode root, int data){
        if(root == null) return false;
        if(root.data == data) return true;
        if(data < root.data) return searchHelperRec(root.left,data);
        if(data > root.data) return searchHelperRec(root.right,data);
        return false;
    }
    /**
     * Not taking into account the case where something might have the same data value
     * **/
    public void insert(int data){
        //insertHelperRec(root,new BTNode(data)); - recursive way of doing this
        insertHelperIter(root,new BTNode(data));
    }

    private void insertHelperIter(BTNode root, BTNode node){
        BTNode curNode = root;
        while(true){
            if(node.data > curNode.data){
                if(curNode.right == null){
                    curNode.right = node;
                    return;
                }
                curNode = curNode.right;
            }else if(node.data < curNode.data){
                if(curNode.left == null){
                    curNode.left = node;
                    return;
                }
                curNode = curNode.left;
            }
        }
    }

    private void insertHelperRec(BTNode root, BTNode node){
        if(node.data < root.data){
            if(root.left == null){
                root.left = node;
                return;
            }
            insertHelperRec(root.left,node);
        }else if(node.data > root.data){
            if(root.right == null){
                root.right = node;
                return;
            }
            insertHelperRec(root.right,node);
        }
    }
}
