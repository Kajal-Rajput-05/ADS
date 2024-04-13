import java.util.Scanner;
 class Stack{
	 
	 static final int MAX = 5;
	 int top;
	 int stack[] = new int [MAX];
	 Stack(){
		 top = -1;
	 }
	 boolean isEmpty(){
		 return (top < 0);
	 }
	 boolean isFull(){
		 return (top > MAX);
	 }
	 boolean push(int x){
		 if(top >= (MAX-1)){
			 System.out.println("Stack Overflow..!");
			 return false;
		 }
		 else{
			 stack[++top] = x;
			 System.out.println("Insert Succesful : "+x);
			 return true;
		 }
	 }
	 int pop(){
		if(top < 0){
		 System.out.println("Stack Underflow..!");
		 return 0;
		}
		else{
			 int x = stack[top--];
			 System.out.println("Delete Succesful : "+x);
			 return x;
		}
	 }
	 int peek(){
		 if(top<0){
			System.out.println("Empty");
			return 0;
		 }
		 else{
			int x = stack[top];
		return x;
		}
	 }

	 
	 public static void main(String args []){
		Stack s1 = new Stack();
		Scanner sc = new Scanner(System.in);

			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.EXIT");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
		while(choice != 5){
			switch(sc.nextInt()){
				case 1 : 
				System.out.print("Enter the num : ");
				s1.push(sc.nextInt());
				break;
				case 2 : s1.pop();
				break;
				case 3 : s1.peek();
				break;
				default : System.out.println("Wrong Choice");
				break;	
			}
		}
		System.out.println(s1.isEmpty());
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println(s1.pop()+"pop form stack");
		System.out.println(s1.peek()+"Peek form stack");
	 } 
 }

//-----------------------
/*
 class Stack{
	 
	 static final int MAX = 10;
	 int top;
	 int stack[] = new int [MAX];
	 Stack(){
		 top = -1;
	 }
	 boolean isEmpty(){
		 return (top < 0);
	 }
	 boolean isFull(){
		 return (top > MAX);
	 }
	 boolean push(int x){
		 if(top >= (MAX-1)){
			 System.out.println("Stack Overflow..!");
			 return false;
		 }
		 else{
			 stack[++top] = x;
			 System.out.println("Insert Succesful : "+x);
			 return true;
		 }
	 }
	 int pop(){
		if(top < 0){
		 System.out.println("Stack Underflow..!");
		 return 0;
		}
		else{
			 int x = stack[top--];
			 System.out.println("Delete Succesful : "+x);
			 return x;
		}
	 }
	 int peek(){
		 if(top<0){
			System.out.println("Empty");
			return 0;
		 }
		 else{
			int x = stack[top];
		return x;
		}
	 }
	 public static void main(String args []){
		Stack s1 = new Stack();
		System.out.println(s1.isEmpty());
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println(s1.pop()+"pop form stack");
		System.out.println(s1.peek()+"Peek form stack");
	 } 
 }
*/