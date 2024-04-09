 class D3Que5 {
	static class Node {
    int data;
    Node link;
		Node(int x){
        data = x;
        link = null;
		}
	}
    static void pushNode(Node[] head, int data){
        
        Node new_node = new Node(data);
        new_node.link = head[0];
        head[0] = new_node;
    }
    static int getMiddle(Node head){
        Node ptr1 = head;
        Node ptr2 = head;

        while (ptr2 != null && ptr2.link != null) {
            ptr2 = ptr2.link.link;
            ptr1 = ptr1.link;
        }
        return ptr1.data;
    }

    public static void main(String[] args){
        Node[] head = new Node[1];
        for (int i = 0; i < 7; i++) {
            pushNode(head, i);
        }
        System.out.println( "Middle Value : " + getMiddle(head[0]));
    }
}