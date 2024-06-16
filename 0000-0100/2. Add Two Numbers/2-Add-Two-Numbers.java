/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;
        ListNode sum = new ListNode(0);
        ListNode res = sum;


        while (listNode1 != null && listNode2 != null) {

            sum.val += listNode1.val + listNode2.val;
            if(sum.val > 9){
                sum.val -= 10;
                sum.next = new ListNode(1);
            }else{
                if(listNode1.next != null || listNode2.next != null)
                    sum.next = new ListNode(0);

            }
            if(listNode1.next == null && listNode2.next != null){
                listNode1.next = new ListNode(0);
            }
            if(listNode1.next != null && listNode2.next == null){
                listNode2.next = new ListNode(0);
            }
            sum = sum.next;
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }


        return res;

    }
}
