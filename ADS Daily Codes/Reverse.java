
//VVVVVVV important
class Reverse { 
    static Node head;

    static class Node {
        int data;
        Node next;
		
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.head = new Node(11);
        list.head.next = new Node(22);
        list.head.next.next = new Node(33);
        list.head.next.next.next = new Node(44);
		list.head.next.next.next.next = new Node(55);

        System.out.print("Reversed linked list :  ");
        list.printList(head);
    }
}
//------------------------------------------------
/*
// reverse the linked list
public void reverse ( Node node ){
	node = head;
	Node prev = null;
	Node curr = node;
	Node next = null;
	
	while( curr != null ){
		next = curr.link;
		curr.link = prev;
		prev = curr;
		curr = next;
	}
	head  = prev;	
}
*/