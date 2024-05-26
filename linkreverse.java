class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
    }
  } 
  class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode curr = head;
      while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
      }
      return prev;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);
  
      
      System.out.print("Original list: ");
      ListNode curr = head;
      while (curr != null) {
        System.out.print(curr.val + " -> ");
        curr = curr.next;
      }
      System.out.println("NULL");
      Solution solution = new Solution();
      ListNode reversedHead = solution.reverseList(head);    
      System.out.print("Reversed list: ");
      curr = reversedHead;
      while (curr != null) {
        System.out.print(curr.val + " -> ");
        curr = curr.next;
      }
      System.out.println("NULL");
    }
  }
  
