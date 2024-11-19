public class remElem {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode temp = prev;
        ListNode curr = head;
        while(curr != null) {
            if(curr.val == val) {
                temp.next = curr.next;
                curr = curr.next;
                continue;
            }
            temp = curr;
            curr = curr.next;
        }
        return prev.next;
    } 
}
