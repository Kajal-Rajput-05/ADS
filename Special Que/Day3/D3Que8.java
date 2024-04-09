import java.util.Scanner;
class D3Que8 { 
    Node head; 
	class Node { 
    int data; 
    Node next; 
    Node(int d) { 
        data = d; 
        next = null; 
    } 
} 
    public int GetNth(int pos){ 
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
        D3Que8 list = new D3Que8(); 
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