  
class D4Que4 {
	static class Node  { 
    int data; 
    Node next, prev; 
    Node(int key) { 
        data = key; 
        next = null; 
        prev = null; 
		} 
	}
    static Node insert(Node head, int data){ 
        Node new_node = new Node(data); 
        new_node.next = head; 
        new_node.prev = null; 
        if (head != null) 
            head.prev = new_node; 
        head = new_node;        
        return head; 
    } 
    static int size(Node node) { 
        int res = 0; 
        while (node != null){ 
                res++; 
                node = node.next; 
        } 
        return res; 
    } 
    public static void main(String args[]){ 
        Node head = null;  
        head = insert(head, 11); 
        head = insert(head, 22); 
        head = insert(head, 33); 
        head = insert(head, 44);
		head = insert(head, 55);
		System.out.print("Size of List : ");
        System.out.println(size(head)); 
    } 
}