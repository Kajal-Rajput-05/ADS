// delete at last
class Deletion {
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void delete( int key ){
			Node temp = head, prev = null;
	
			while( temp != null && temp.data != key ){
				prev = temp;
				temp = temp.link;
			}
			if(temp == null)
				return;
			prev.link = temp.link;
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Deletion l1 = new Deletion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		Node fourth = new Node(44);
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		third.link = fourth;
				
		l1.delete( 44 );
		l1.display();
	}
}
//---------------------------------------------------
/*
//delete at specific
class Deletion {
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void delete( int key ){
			Node temp = head, prev = null;
	
			while( temp != null && temp.data != key ){
				prev = temp;
				temp = temp.link;
			}
			if(temp == null)
				return;
			prev.link = temp.link;
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		Deletion l1 = new Deletion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		Node fourth = new Node(44);
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		third.link = fourth;
				
		l1.delete( 33 );
		l1.display();
	}
}
*/
//------------------------------------------------
/*
//delete at first

class Deletion {
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void delete( int key ){
			Node temp = head, prev = null;
			if (temp != null && temp.data == key)
				head = temp.link;
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
		
		Deletion l1 = new Deletion();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
				
		l1.delete( 11 );
		l1.display();
	}
}
*/