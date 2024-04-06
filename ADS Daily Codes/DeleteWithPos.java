
//through scanner
import java.util.Scanner;
class DeleteWithPos {
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
    void deleteNode(int position){
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next; 
            return;
        }
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
 
        temp.next
            = next; 
    }
    public void printList(){
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
		System.out.println();
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        DeleteWithPos list = new DeleteWithPos();
 
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.insert(55);
 
        list.printList();
		System.out.print("Enter the Position to delete node : ");
		int n = sc.nextInt();
	    list.deleteNode(n);
        list.printList();
    }
}



/*
class DeleteWithPos {
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
    void deleteNode(int position){
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next; 
            return;
        }
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
 
        temp.next
            = next; 
    }
    public void printList(){
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
		System.out.println();
    }
    public static void main(String[] args){
        DeleteWithPos list = new DeleteWithPos();
 
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.insert(55);
 
        list.printList();
	    list.deleteNode(4);
        list.printList();
    }
}
*/
//-----------------------------------------------------
/*
//delete node with position at start, end and specific position
		public void delete( int pos ){
			
			if (head == null)
				return;
			Node temp = head;
			if(pos == 0){
				head = temp.link;
				return;
			}
			for(int i=0; temp != null && i <= pos ;i++){
				temp = temp.link;
				if( temp == null || temp.link == null )
					return;
				Node n = temp.link.link;
				temp.link = n;
			}
		}

*/