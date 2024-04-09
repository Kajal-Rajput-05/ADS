	 
	class D3Que4 {
		Node head;
		public void addToTheLast(Node node){
			if (head == null) {
				head = node;
			}
			else {
				Node temp = head;
				while (temp.next != null)
					temp = temp.next;
				temp.next = node;
			}
		}
    void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        D3Que4 llist1 = new D3Que4();
        D3Que4 llist2 = new D3Que4();
        llist1.addToTheLast(new Node(5));
        llist1.addToTheLast(new Node(25));
        llist1.addToTheLast(new Node(15));
		
        llist2.addToTheLast(new Node(17));
        llist2.addToTheLast(new Node(9));
        llist2.addToTheLast(new Node(86));
        llist1.head = new Gfg().sortedMerge(llist1.head, llist2.head);
        System.out.println("Merged : ");
        llist1.printList();
		}
	}
	class merge {
    Node sortedMerge(Node headA, Node headB){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        while (true) {
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}