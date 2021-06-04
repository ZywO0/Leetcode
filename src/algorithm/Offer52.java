package algorithm;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//    	你变成我，走过我走过的路。
//    	我变成你，走过你走过的路。
//    	然后我们便相遇了.
    	ListNode a1 = headA;
    	ListNode a2 = headB;
    	int flag1 =0, flag2 =0;
    	while(a1 != a2) {
    		if(a1 != null) {
    			a1 = a1.next;
    		}
    		else {//没有交点的话，第二次他们会同时指向A和B的最后一个节点的next，而最后一个节点的next都是null，此时相等，返回null
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
    	
    	
   
    	
    	//set来判断，复杂度极高，不推荐
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
