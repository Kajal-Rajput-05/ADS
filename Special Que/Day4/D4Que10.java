import java.util.*;
import java.io.*;
class D4Que10 {
		static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
    static void Print_Head_Nodes(Node root, HashMap<Node, Node> ParentNodes){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node k = q.peek();
            q.remove();
            if (k.left != null) {
                ParentNodes.put(k.left, k);
                q.add(k.left);
            }
            if (k.right != null) {
                ParentNodes.put(k.right, k);
                q.add(k.right);
            }
        }
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(6);
        HashMap<Node, Node> ParentNodes = new HashMap<>();
        Print_Head_Nodes(root, ParentNodes);
        for (Map.Entry<Node, Node> i :
             ParentNodes.entrySet()) {
            System.out.println("Head Node : " + i.getKey().data + " = "+ i.getValue().data);
        }
    }
}