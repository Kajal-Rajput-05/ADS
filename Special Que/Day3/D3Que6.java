
class D3Que6{
    static class Node {
        int data;
        Node next;
        int x;
        Node(int x){
            data = x;
            next = null;
              x = 0;
        }
    }
    static Node push(Node node, int new_data){
        Node new_node = new Node(new_data);
        new_node.next = node;
        node = new_node;
        return node;
    }
    static boolean detectLoop(Node root){
        while (root != null) {

            if (root.x == 1)
                return true;
            root.x = 1;

            root = root.next;
        }
        return false;
    }
    public static void main(String[] args){
        Node head = null;
        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);
        head.next.next.next.next = head;
        if (detectLoop(head))
            System.out.print("Loop Detected");
        else
            System.out.print("Loop Not Detected");
    }
}