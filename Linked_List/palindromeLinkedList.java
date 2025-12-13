import java.lang.classfile.components.ClassPrinter.ListNode;

public class palindromeLinkedList {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        // Step 1: Find middle (slow reaches mid)
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverse(slow);

        // Step 3: Compare first half & reversed second half
        ListNode firstHalf = head;
        ListNode temp = secondHalf;
        boolean isPalin = true;

        while(temp != null) {
            if(firstHalf.data != temp.data) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Step 4: (Optional) Restore list
        reverse(secondHalf);

        return isPalin;
    }

    // Reverse Linked List function
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
