
class D5Que9 {
    Node head;
	static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}  
    public void swap(int x, int y) {
        if (x == y) {
            return;
        }
        Node a = null, i = head;
        while (i != null && i.data != x) {
            a = i;
            i = i.next;
        }
        Node b = null, j = head;
        while (j != null && j.data != y) {
            b = j;
            j = j.next;
        }
        if (i == null || j == null) {
            return;
        }
        if (a != null) {
            a.next = j;
        } else {
            head = j;
        }
        if (b != null) {
            b.next = i;
        } else {
            head = i;
        }
    
        Node temp = i.next;
        i.next = j.next;
        j.next = temp;
    }
    public void bubbleSort() {
        if (head == null) {
            return;
        }
 
        int count = 0;
        Node start = head;
        while (start != null) {
            count++;
            start = start.next;
        }
        for (int i = 0; i < count; i++) {
            Node curr = head;
            while (curr != null && curr.next != null) {
                if (curr.data > curr.next.data) {
                    swap(curr.data, curr.next.data);
                }
                curr = curr.next;
            }
        }
    }
    public void display() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
		return;
    }
    public static void main(String[] args) {
        int[] arr = {11, 88, 55, 33, 66, 22};
        D5Que9 list = new D5Que9();
        list.head = new Node(arr[0]);
        Node start = list.head;
        for (int i = 1; i < arr.length; i++) {
            start.next = new Node(arr[i]);
            start = start.next;
        }
        list.display();
        list.bubbleSort();
        System.out.println();
        list.display();
    }
}