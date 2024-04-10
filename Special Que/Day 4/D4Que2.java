
class D4Que2{	
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
		D4Que2 d1 = new D4Que2();
		d1.insert(11);
		d1.insert(22);
		d1.insert(33);
		d1.insert(44);
		d1.insert(55);
		d1.display( d1.head );		
	}
}

