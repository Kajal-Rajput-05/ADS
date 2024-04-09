
class D3Que9 {
    Node head; 
    Node slow_ptr, fast_ptr, mid;
    class Node {
        char data;
        Node next;
        Node(char d){
            data = d;
            next = null;
        }
    }
    boolean isPalindrome(Node head) {
        slow_ptr = head;
        fast_ptr = head;
        Node prev_of_slow_ptr = head;
        Node midnode = null; 
        boolean res = true; 

        if (head != null && head.next != null) {
            while (fast_ptr != null
                   && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;

                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            mid = slow_ptr;
            prev_of_slow_ptr.next
                = null; 
            reverse(); 
            res = compareLists(head, mid); 
            reverse(); 
            if (midnode != null) {
                prev_of_slow_ptr.next = midnode;
                midnode.next = mid;
            }
            else
                prev_of_slow_ptr.next = mid;
        }
        return res;
    }
    void reverse(){
        Node prev = null;
        Node current = mid;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        mid = prev;
    }
    boolean compareLists(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }
        if (temp1 == null && temp2 == null)
            return true;
        return false;
    }
    public void push(char new_data){    
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node ptr){
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        D3Que9 llist = new D3Que9();
        char str[] = { 'a', 'b', 'c', 'e', 'c', 'b', 'a' };
        String string = new String(str);
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
        }
        if (llist.isPalindrome(llist.head) != false) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}