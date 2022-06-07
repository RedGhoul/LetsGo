package StephenGrider;

public class SG_23_Tail_Back {
    public static void main(String[] args){
        SG_21_Find_MidPoint_LLdataNode s1 = new SG_21_Find_MidPoint_LLdataNode(1);
        SG_21_Find_MidPoint_LLdataNode s2 = new SG_21_Find_MidPoint_LLdataNode(2);
        SG_21_Find_MidPoint_LLdataNode s3 = new SG_21_Find_MidPoint_LLdataNode(3);
        SG_21_Find_MidPoint_LLdataNode s4 = new SG_21_Find_MidPoint_LLdataNode(4);
        SG_21_Find_MidPoint_LLdataNode s5 = new SG_21_Find_MidPoint_LLdataNode(5);
        SG_21_Find_MidPoint_LLdataNode s6 = new SG_21_Find_MidPoint_LLdataNode(6);
        s1.Next = s2;
        s2.Next = s3;
        s3.Next = s4;
        s4.Next = s5;
        s5.Next = s6;
        int circle = getDataXPostionsFromTheTail(2,s1);
        System.out.println(circle);
    }

    public static int getDataXPostionsFromTheTail(int steps, SG_21_Find_MidPoint_LLdataNode head){
        if(head == null || head.Next == null) return 0;

        SG_21_Find_MidPoint_LLdataNode p1 = head;
        SG_21_Find_MidPoint_LLdataNode p2 = head;

        for(int i =0; i < steps+1; i++){
            if(p2 == null) return 0; // means steps is out of bounds
            p2 = p2.Next;
        }

        while(p2 != null){
            p1 = p1.Next;
            p2 = p2.Next;
        }

        return p1.data;
    }
}
