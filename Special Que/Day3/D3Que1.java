
 class D3Que1{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){	
		D3Que1 l1 = new D3Que1();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		l1.display();
	}
}