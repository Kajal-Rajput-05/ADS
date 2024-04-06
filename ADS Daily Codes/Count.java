
//Recursive way
class Count{
    Node head;  
	
	class Node{
    int data;
    Node next;
    Node(int d){  
        data = d;  
        next = null; 
    }
}

    public void insert(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int getCountRecursion(Node node){
        if (node == null)
            return 0;
        return 1 + getCountRecursion(node.next);
    }

    public int getCount(){
        return getCountRecursion(head);
    }
	
    public static void main(String[] args){
        Count list = new Count();
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.insert(55);
 
        System.out.println("Count : " + list.getCount());
    }
}
//----------------------------------
/*
//Smile way
class Count {
		Node head; 
		
	class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
    public void insert(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public int getCountt(){
        Node temp = head;
        int countt = 0;
        while (temp != null) {
            countt++;
            temp = temp.next;
        }
        return countt;
    }

    public static void main(String[] args){

        Count list = new Count();
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.insert(55);
 
        System.out.println("Count : " + list.getCountt());
    }
}
*/
//----------------------------------------------
/*
//count the no. of nodes in linked list 

//in simple way
public int count (Node temp){
	Node temp = head;
	int c = 0;
	while( temp != null ){
		c++;
		temp = temp.link;
	}
	return c;
}

// in recursive way
public int countRecursive( Node temp ){
	if( temp == null )
		return 0;
	return 1 + countRecursive( temp.link );
}
*/