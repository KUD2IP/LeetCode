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

        ListNode sum = new ListNode(0);
        ListNode res = sum;


        while (l1 != null && l2 != null) {

            sum.val += l1.val + l2.val;
            if(sum.val > 9){
                sum.val -= 10;
                sum.next = new ListNode(1);
            }else{
                if(l1.next != null || l2.next != null)
                    sum.next = new ListNode(0);

            }
            if(l1.next == null && l2.next != null){
                l1.next = new ListNode(0);
            }
            if(l1.next != null && l2.next == null){
                l2.next = new ListNode(0);
            }
            sum = sum.next;
            l1 = l1.next;
            l2 = l2.next;
        }


        return res;

    }
}
