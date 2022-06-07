package StephenGrider;

public class SG_22_Is_Circular_List {
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
        s4.Next = null;
        //s5.Next = s2;
        Boolean circle = isCircle(s1);
        System.out.println(circle);
    }

    public static boolean isCircle(SG_21_Find_MidPoint_LLdataNode head){
        if(head == null || head.Next == null) return false;

        SG_21_Find_MidPoint_LLdataNode p1 = head;
        SG_21_Find_MidPoint_LLdataNode p2 = head;

        while(p2 != null && p2.Next != null){

            p1 = p1.Next;
            p2 = p2.Next.Next;
            if(p1 == p2){
                return true;
            }
        }

        return false;
    }
}
