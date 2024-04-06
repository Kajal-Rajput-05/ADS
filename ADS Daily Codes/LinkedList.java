
 class LinkedList{
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
		
		LinkedList l1 = new LinkedList();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		l1.display();
	}
}

/*
head.data-11
second.data-22
third.data-33
third.link-null address
second.link-add of thrid
head.link-addres of second
head.link.link-add of third
third.linl.link-add that is null
*/

//--------------------------------------
/*
// linked lis coonection in basic way
// no return statrment thats why no output is there
public class LinkedList{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data =d;
				link=null;
		}
	}
	public static void main(String args[]){
		
		LinkedList l1 = new LinkedList();
		l1.head = new Node(11);
		Node second = new Node(22);
		Node third = new Node(33);
		
		l1.head.link = second;
		second.link = third;
	}
}
*/
//--------------------------------------
/*
// Head creation

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
}
*/
//--------------------------------------



