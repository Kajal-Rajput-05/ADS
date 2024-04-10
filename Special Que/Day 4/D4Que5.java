
class D4Que5 {
    static class Node {
        int data;
        Node next;
        Node prev;
    }
    static Node insert(Node root, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = (root);
        if ((root) != null)
            (root).prev = new_node;
        (root) = new_node;
        return root;
    }
    static int Large(Node root){
        Node max, temp;
        temp = max = root;
        while (temp != null) { 
            if (temp.data > max.data)
                max = temp;
            temp = temp.next;
        }
        return max.data;
    }
    public static void main(String args[]){
        Node head = null;
        head = insert(head, 11);
        head = insert(head, 22);
        head = insert(head, 33);
        head = insert(head, 44);
		System.out.print("Largest Node : ");
        System.out.printf("%d", Large(head));
    }
}