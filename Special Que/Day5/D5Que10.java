class D5Que10 { 
	static class Node {  
		int data;  
		Node prev;  
		Node next;  
	} 
	static Node insertAtTheBegin( Node start_ref, int data){  
		Node ptr1 = new Node();  
		ptr1.data = data;  
		ptr1.next = start_ref;  
		if (start_ref != null)  
		(start_ref).prev = ptr1;  
		start_ref = ptr1; 
		return start_ref; 
	}  
	static void display( Node start){  
		Node temp = start;  
		System.out.println();  
		while (temp != null)  {  
			System.out.print( temp.data + " ");  
			temp = temp.next;  
		}  
	}  
	static Node bubbleSort( Node start) {  
		int swap, i;  
		Node ptr1;  
		Node lptr = null;  
		if (start == null)  
			return null;  
		do{  
			swap = 0;  
			ptr1 = start;  
			while (ptr1.next != lptr){  
				if (ptr1.data > ptr1.next.data) {  
					int t = ptr1.data; 
					ptr1.data = ptr1.next.data; 
					ptr1.next.data = t; 
					swap = 1;  
				}  
				ptr1 = ptr1.next;  
			}  
			lptr = ptr1;  
		}  
		while (swap != 0);  
			return start; 
	}  
	public static void main(String args[]) {  
		int arr[] = {11, 88,77, 44, 22, 55};  
		int list_size, i;  
		Node start = null;  
		for (i = 0; i < 6; i++)  
			start=insertAtTheBegin(start, arr[i]);  
		display(start);  
		start = bubbleSort(start);  
		display(start);  
	}  
} 