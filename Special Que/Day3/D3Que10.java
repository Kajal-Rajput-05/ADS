public class D3Que10{
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
		D3Que10 l1 = new D3Que10();
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