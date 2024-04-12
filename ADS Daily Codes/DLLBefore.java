
 class DLLBefore {
    Node head;
    static class Node {
        int data;
        Node next,prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }   
    }
    void insert(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev=null;
        if(head!=null)
            head.prev=new_Node;
        head =new_Node;   
    }
    void insertBefore(int key,int new_data){
        Node new_Node = new Node(new_data);
        Node nxt=head;
        if(head==null|| head.data == key){
            insert(new_data);
            return;
        }     
        while (nxt!= null && nxt.data!=key) {
            nxt=nxt.next;
        }
        new_Node.next=nxt;
        new_Node.prev=nxt.prev;
        nxt.prev.next=new_Node;   
    }
    void display(){
        Node nxt =head;
        while (nxt!=null){
            System.out.print(nxt.data+" ");  
            nxt=nxt.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DLLBefore d1 = new DLLBefore();
        d1.insertBefore(2,10);
        d1.display();
        d1.insertBefore(10,15);
        d1.display();
        d1.insertBefore(10,12);
        d1.display();
    }
}