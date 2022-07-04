package ColtSteele;


import java.util.*;
enum DFS_TYPE {
    PRE,
    IN,
    POST
}
public class SG_23_TreeTraversal {
    public static void main(String[] args){
        BTNode root = new BTNode(10);
        BTNode rootL1 = new BTNode(6);
        BTNode rootR1 = new BTNode(15);
        BTNode rootLL2 = new BTNode(3);
        BTNode rootLR2 = new BTNode(8);
        BTNode rootRR2 = new BTNode(20);
        root.left = rootL1;
        root.right = rootR1;
        rootL1.left = rootLL2;
        rootL1.right = rootLR2;
        rootR1.right = rootRR2;

        List<BTNode> answer = BFSRe(root);
        for(BTNode node: answer){
            System.out.print(node.data + ",");
        }
        System.out.println("");
        answer = BFSRe(root);
        for(BTNode node: answer){
            System.out.print(node.data + ",");
        }
        System.out.println("");
        System.out.println("PRE");
        answer = DFSRec(root, DFS_TYPE.PRE);
        for(BTNode node: answer){
            System.out.print(node.data + ",");
        }
        System.out.println("");
        System.out.println("IN");
        answer = DFSRec(root, DFS_TYPE.IN);
        for(BTNode node: answer){
            System.out.print(node.data + ",");
        }
        System.out.println("");
        System.out.println("POST");
        answer = DFSRec(root, DFS_TYPE.POST);
        for(BTNode node: answer){
            System.out.print(node.data + ",");
        }
        System.out.println("");
    }
    public static List<BTNode> BFSIter(BTNode node){
        if(node == null) return null;
        ArrayList<BTNode> answer = new ArrayList<>();
        Queue<BTNode> qq = new LinkedList<>();
        qq.add(node);
        while(!qq.isEmpty()){
            BTNode cur = qq.remove();
            if(cur.left != null){ // its kind of implied we go from left to right
                // instead of from right to left
                qq.add(cur.left);
            }
            if(cur.right != null){
                qq.add(cur.right);
            }

        }
        return answer;
    }

    public static List<BTNode> BFSRe(BTNode node){
        if(node == null) return null;
        ArrayList<BTNode> answer = new ArrayList<>();
        Queue<BTNode> qq = new LinkedList<>();
        qq.add(node);
        BFSReHelper(answer, qq);
        return answer;
    }

    public static void BFSReHelper(ArrayList<BTNode> answers, Queue<BTNode> qq){
        if(qq.isEmpty()) return;
        BTNode cur = qq.remove();
        answers.add(cur);
        if(cur.left != null){ // its kind of implied we go from left to right
            // instead of from right to left
            qq.add(cur.left);
        }
        if(cur.right != null){
            qq.add(cur.right);
        }

        BFSReHelper(answers,qq);
    }


    public static List<BTNode> DFSRec(BTNode root, DFS_TYPE type){
        if(root == null) return null;
        ArrayList<BTNode> answer = new ArrayList<>();
//        Stack<BTNode> ss = new Stack<>();
//        ss.add(root);
        DFSRecHelper(answer, root, type);
        return answer;
    }

    public static void DFSRecHelper(List<BTNode> answer, BTNode curNode, DFS_TYPE type){
        if(curNode == null) return;

        if(type == DFS_TYPE.PRE){
            answer.add(curNode);
        }
        if(curNode.left != null){
            DFSRecHelper(answer, curNode.left, type);
        }
        if(type == DFS_TYPE.IN){
            answer.add(curNode);
        }
        if(curNode.right != null){
            DFSRecHelper(answer, curNode.right, type);
        }

        if(type == DFS_TYPE.POST){
            answer.add(curNode);
        }
    }
    public static List<BTNode> DFSIte(BTNode root, DFS_TYPE type){
        if(root == null) return null;
        ArrayList<BTNode> answer = new ArrayList<>();
        Stack<BTNode> ss = new Stack<>();
        ss.add(root);
        while(!ss.isEmpty()){
            BTNode curNode = ss.pop();
            if(curNode.left != null){
                ss.add(curNode.left);
            }
            if(curNode.right != null){
                ss.add(curNode.right);
            }
            answer.add(curNode);
        }
        return answer;
    }
    public static void DFSRecHelper(List<BTNode> answer, Stack<BTNode> stack, DFS_TYPE type){
        if(stack.isEmpty()) return;
        BTNode curNode = stack.pop();
        if(type == DFS_TYPE.PRE){
            answer.add(curNode);
        }
        if(curNode.left != null){
            stack.add(curNode.left);
        }
        if(type == DFS_TYPE.IN){
            answer.add(curNode);
        }
        if(curNode.right != null){
            stack.add(curNode.right);
        }
        DFSRecHelper(answer, stack, type);

        if(type == DFS_TYPE.POST){
            answer.add(curNode);
        }
    }

}
