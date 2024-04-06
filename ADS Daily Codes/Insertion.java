 
 //insert at last node
 class Insertion{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void insertEnd( int new_data ){
			Node new_node = new Node(new_data);
			if(head == null){
				head = new Node(new_data);
				return;
			}
			new_node.link = null;
			Node last = head;
			while( last.link != null )
				last = last.link;
				last.link = new_node;
				return;
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Insertion l1 = new Insertion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		
		l1.insertEnd( 44 );
		l1.insertEnd( 55 );
		l1.display();
	}
}

//---------------------------------------
/*
//insert at specific position

 class Insertion{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void insertAfter(Node prev_node, int new_data ){
			Node new_node = new Node(new_data);
			new_node.link = prev_node.link;
			prev_node.link = new_node;			
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Insertion l1 = new Insertion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		
		l1.insertAfter( l1.head.link,44 );
		l1.display();
	}
}
*/
//----------------------------------------------------
/*
//insert at specific position

 class Insertion{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void insertAfter(Node prev_node, int new_data ){
			Node new_node = new Node(new_data);
			new_node.link = prev_node.link;
			prev_node.link = new_node;			
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Insertion l1 = new Insertion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		
		l1.insertAfter( l1.head.link.link,44 );
		l1.display();
	}
}
*/
//--------------------------------------------------
/*
//insert at specific position

 class Insertion{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void insertAfter(Node prev_node, int new_data ){
			Node new_node = new Node(new_data);
			new_node.link = prev_node.link;
			prev_node.link = new_node;			
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Insertion l1 = new Insertion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		
		l1.insertAfter( l1.head,44 );
		l1.display();
	}
}
*/
//------------------------------------------------------
/*
//insert at first position

 class Insertion{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void insert(  ){
			Node new_node = new Node(new_data);
			new_node.link = head;
			head = new node;
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Insertion l1 = new Insertion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
				
		l1.insert(10);
		l1.display();
	}
}
*/