
class D3Que7{
	static class Node {
	  int key;
	  Node next;
	}
	static Node newNode(int key){
	  Node node = new Node();
	  node.key = key;
	  node.next = null;
	  return node;
	}
	static void printList(Node head){
	  while (head != null) {
		System.out.print(head.key + " ");
		head = head.next;
	  }
	  System.out.println();
	}
	static Node detectAndRemoveLoop(Node head){
	  if (head == null || head.next == null)
		return null;	 
	  Node slow = head, fast = head;
	  slow = slow.next;
	  fast = fast.next.next;
	  while (fast != null && 
			 fast.next != null) {
		if (slow == fast)
		  break;
		slow = slow.next;
		fast = fast.next.next;
	  }	 
	  if (slow != fast)
		return null; 
	  slow = head;
	  while (slow != fast){
		slow = slow.next;
		fast = fast.next;
	  }	 
	  return slow;
	}
	public static void main(String[] args){
	  Node head = newNode(50);
	  head.next = newNode(20);
	  head.next.next = newNode(15);
	  head.next.next.next = newNode(4);
	  head.next.next.next.next = newNode(10);
	  head.next.next.next.next.next = head.next.next;
	  Node res = detectAndRemoveLoop(head);
	  if (res == null)
		System.out.print("Null");
	  else
		System.out.print("Starting Node : " +  res.key);
	}
}