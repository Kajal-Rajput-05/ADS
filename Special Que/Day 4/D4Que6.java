
class D4Que6 {
	static class Node { 
    int data; 
    Node next, prev; 
	} 
    static Node getNode(int data) {
            Node newNode = new Node();      
            newNode.data = data;  
            newNode.prev = newNode.next = null;  
            return newNode;  
  
    } 
    static Node sort(Node head, Node newNode) { 
            Node current; 
              if (head == null) 
                head = newNode;  
              else if (head.data >= newNode.data) { 
                newNode.next = head; 
                newNode.next.prev = newNode; 
                head = newNode; 
            } 
            else{ 
                current = head; 
                while (current.next != null &&  
                        current.next.data < newNode.data)  
                    current = current.next;         
                newNode.next = current.next; 
                if (current.next != null)  
                newNode.next.prev = newNode; 
                current.next = newNode;  
                newNode.prev = current;  
              
            } 
            return head; 
    } 
    static void printList(Node head){ 
            while (head != null){ 
                    System.out.print(head.data + " "); 
                    head = head.next; 
            } 
    } 
    public static void main(String args[]){ 
            Node head = null; 
            Node new_node = getNode(8); 
            head = sort(head, new_node);  
            new_node = getNode(5);  
            head = sort(head, new_node);  
            new_node = getNode(3);  
            head = sort(head, new_node);  
            new_node = getNode(10);  
            head = sort(head, new_node);  
            new_node = getNode(12);  
            head = sort(head, new_node);  
            new_node = getNode(9);  
            head = sort(head, new_node);  
            System.out.print("List : "); 
            printList(head); 
    } 
} 