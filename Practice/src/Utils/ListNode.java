package Utils;

/**
 * Singly-linked list provided by problem for use
 * some attributes made public for testing
 */
public class ListNode {
    public int val;

    //
    public ListNode next;

    ListNode() {}ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode getNext() { return next; }
}

