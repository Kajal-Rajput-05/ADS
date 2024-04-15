import java.util.Stack;
import java.util.Scanner;

class D6Que10 {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void push(int x) {
        if (s1.isEmpty()) {  
            s1.push(x);
        } else {
            while (!s1.isEmpty()) {    
                s2.push(s1.pop());    
            }
            s1.push(x);              
            while (!s2.isEmpty()) {  
                s1.push(s2.pop());    
            }
        }
    }
    int pop() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        D6Que10 queue = new D6Que10();

        System.out.print("How many element to push : ");
        int n = scanner.nextInt();

        System.out.println("Push : ");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.push(element);
        }
        System.out.println("Pop : ");
        while (true) {
            int poppedElement = queue.pop();
            if (poppedElement == -1) {
                break;
            }
            System.out.println(poppedElement);
        }
    }
}