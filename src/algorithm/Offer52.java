package algorithm;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//    	�����ң��߹����߹���·��
//    	�ұ���㣬�߹����߹���·��
//    	Ȼ�����Ǳ�������.
    	ListNode a1 = headA;
    	ListNode a2 = headB;
    	int flag1 =0, flag2 =0;
    	while(a1 != a2) {
    		if(a1 != null) {
    			a1 = a1.next;
    		}
    		else {//û�н���Ļ����ڶ������ǻ�ͬʱָ��A��B�����һ���ڵ��next�������һ���ڵ��next����null����ʱ��ȣ�����null
    			a1 = headB;
    		}
    		if(a2 != null) {
    			a2 = a2.next;
    		}
    		else {
    			a2 = headA;
    		}
    	}
    	return a1;
    	
    	
   
    	
    	//set���жϣ����Ӷȼ��ߣ����Ƽ�
//       Set<ListNode> set =  new HashSet<ListNode>();
//       while(headA != null || headB != null) {
//           if( headA != null && set.contains(headA)  ) {
//    		   return headA;
//    	   }
//            if(headA != null) {
//            	 set.add(headA);
//            	 headA = headA.next;
//            }
//            if( headB != null && set.contains(headB)  ) {
//     		   return headB;
//     	   }
//            if(headB != null) {
//            	set.add(headB);
//           	   headB = headB.next;
//            }
//       }
//       return null;
    }
}
