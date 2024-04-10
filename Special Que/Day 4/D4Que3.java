class D4Que3{	
	Node head;
	static class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
		prev = null;
	}
}
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if( head != null)
			head.prev = new_node;
		head = new_node;
	}
	void deleteNode(int position){     
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next; 
            return;
        }
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
 
        temp.next = next; 
    }
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

	void display(Node n){
		Node p = null;
		System.out.print( "Forward Direction : " );
		while( n != null ){
			System.out.print( n.data+" "  );
		p = n;
		n = n.next;
		}
		
		System.out.println();
		
		System.out.print( "Reverse Direction : ");
		while( p != null ){
		System.out.print( p.data+" " );
		p = p.prev;
		}
		System.out.println();
	}
	public static void main(String args []){
		D4Que3 d1 = new D4Que3();
		
		d1.insert(11);
		d1.insert(22);
		d1.insert(33);
		d1.insert(44);
		d1.insert(55);
		
		d1.display( d1.head );
		d1.deleteNode( 3 );
		d1.display( d1.head );
	}
}