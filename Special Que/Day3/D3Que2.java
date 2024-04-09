class D3Que2{
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
		while( n != null ){
			System.out.print( n.data+" "  );
		p = n;
		n = n.next;
		}

	}
	public static void main(String args []){
		D3Que2 d1 = new D3Que2();		
		d1.insert(22);
		d1.insert(33);
		d1.insert(44);
		d1.insert(66);
		d1.display( d1.head );			
	}
}