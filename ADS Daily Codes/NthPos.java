
import java.util.Scanner;
class NthPos {
    Node head; 
    
	class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void printNthFromLast(int N){
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < N)
            return;

        temp = head;
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }
    public void insert(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        NthPos list = new NthPos();
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
		list.insert(55);
		
		System.out.print("Enter the position to be search : ");
		int n = sc.nextInt();
        
        list.printNthFromLast(n);
    }
} 

//-----------------------------------------------------
/*
// t get nth node of linked list
public int nelement(int pos){
	Node temp = head;
	int c = 0;
	while( temp != null ){
		if ( c == pos )
			return temp.data;
		c++;
		temp = temp.link;
	}	
		assert ( false );
		return 0;
}
*/
//--------------------------------------------------------
/*
// HW : to get nth postion of linked list by reverse order

import java.util.Scanner;

class Node { 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
  
class NthPos { 
    Node head; 
    public int GetNth(int pos) 
    { 
        Node current = head; 
        int count = 0; 
        while (current != null) 
        { 
            if (count == pos) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
        assert (false); 
        return 0; 
    } 
    public void insert(int new_data) { 
        Node new_Node = new Node(new_data); 
        new_Node.next = head; 
        head = new_Node; 
    } 
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
        NthPos list = new NthPos(); 
        list.insert(11); 
        list.insert(22); 
        list.insert(33); 
        list.insert(44); 
        list.insert(55); 
		
		System.out.print(" Enter the position to be search : ");
		int n = sc.nextInt();
        System.out.println("Element at Position "+ n +" : " + list.GetNth(n)); 
    } 
}
*/
