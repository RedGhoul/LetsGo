package StephenGrider;

import java.util.LinkedList;

public class SG_21_Find_MidPoint_LL {

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
        SG_21_Find_MidPoint_LLdataNode mid = findMid(s1);
        System.out.println(mid);
    }

    public static SG_21_Find_MidPoint_LLdataNode findMid (SG_21_Find_MidPoint_LLdataNode head){
        if(head == null || head.Next == null) return null;

        SG_21_Find_MidPoint_LLdataNode p1 = head;
        SG_21_Find_MidPoint_LLdataNode p2 = head;

        while(p2 != null && p2.Next != null){
            p1 = p1.Next;
            p2 = p2.Next.Next;
        }

        return p1;
    }
}
