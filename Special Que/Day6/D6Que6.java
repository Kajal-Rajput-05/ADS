 class D6Que6{
	 
	 static final int MAX = 10;
	 int top;
	 int stack[] = new int [MAX];
	 D6Que6(){
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
		D6Que6 s1 = new D6Que6();
		System.out.println(s1.isEmpty());
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println(s1.pop()+"pop form stack");
		System.out.println(s1.peek()+"Peek form stack");
	 } 
 }