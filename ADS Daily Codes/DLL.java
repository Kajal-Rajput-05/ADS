

class DLL{
	
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
//insert at first
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if( head != null)
			head.prev = new_node;
		head = new_node;
	}
//insert at mid	
	void insertAfter(Node prev, int new_data){
		if(prev == null)
			return;
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;
		new_node.prev = prev;
		Node p = new_node.next;
		p.prev = new_node;
	}
//insert at end
	 void insertLast(int new_data){
		Node new_node = new Node(new_data);
		Node n = head; 
		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (n.next != null)
			n = n.next;
			n.next = new_node;
			new_node.prev = n;
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
		DLL d1 = new DLL();
		
		d1.insert(22);
		d1.insert(33);
		d1.insert(44);
		d1.insert(66);
		
		d1.display( d1.head );
		d1.insertAfter(d1.head, 55);
		d1.display( d1.head );
		d1.insertLast(11);
		d1.display( d1.head );
		
		
	}
}

