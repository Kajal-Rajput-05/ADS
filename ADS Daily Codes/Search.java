
class Search{
    Node head;  
	
		class Node{
		int data;
		Node next;
		Node(int d){  
			data = d;  
			next = null; 
		}
	}
	
	public void search ( int x ){
		Node temp = head;
		int i = 1;
		boolean flag = false;
		
		if(head == null) {  
            System.out.println("List is empty");  
        }
		
		else{
		while( temp != null ){
			if( temp.data == x ){
				flag = true; // success
				break;
			}
			i++;
			temp = temp.next;
		}
	}
		 if(flag)  
             System.out.println("Element at the position : " + i);  
        else  
             System.out.println("Element Not Found");
	}

    public void insert(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	
	public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " "); 
            n = n.next; 
		}			
	}
 
    public static void main(String[] args){
        Search list = new Search();
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.insert(55);
		
		list.display();
		System.out.println();
		list.search(44);
       
    }
}

//----------------------------------------------
/*
//search a node element in linked list
public boolean search ( Node temp, int x ){
	Node temp = head;
	while( temp != null ){
		if( temp.data == x )
			return true; // success
		temp = temp.link;
	}
	return false; //failure
}
*/