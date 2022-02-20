package easy;

import easy.domain.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedList206Test {
    ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();

    @Test
    public void testExample1() {
        ListNode end = new ListNode(5, null);
        ListNode nextNextNext = new ListNode(4, end);
        ListNode nextNext = new ListNode(3, nextNextNext);
        ListNode next = new ListNode(2, nextNext);
        ListNode head = new ListNode(1, next);
        ListNode reversedLinkedList = reverseLinkedList206.reverse(head);
        assertEquals(5, reversedLinkedList.val);
        assertEquals(4, reversedLinkedList.next.val);
        assertEquals(3, reversedLinkedList.next.next.val);
        assertEquals(2, reversedLinkedList.next.next.next.val);
        assertEquals(1, reversedLinkedList.next.next.next.next.val);
        assertNull(reversedLinkedList.next.next.next.next.next);
    }

    @Test
    public void testExample2() {
        ListNode end = new ListNode(2, null);
        ListNode head = new ListNode(1, end);
        ListNode reversedLinkedList = reverseLinkedList206.reverse(head);
        assertEquals(2, reversedLinkedList.val);
        assertEquals(1, reversedLinkedList.next.val);
        assertNull(reversedLinkedList.next.next);
    }
}
