 class Rec2 {
	 
	 static int fib(int n){
		 if(n<=1)
			 return n;
		else
			return fib(n-1)+fib(n-2);
				 
	 }
	
	public static void main(String args []){
		int num = 30;
		for(int i=0;i<num;i++){
		System.out.print(fib(i)+" ");
		}
	}
}

//when we execute fib series time consumption increases
// 5 10 30 50 100 print
//through scanner HW
/*
 import java.util.Scanner;
 class Rec2 {
	 
	 static int fib(int n){
		 if(n<=1)
			 return n;
		else
			return fib(n-1)+fib(n-2);
				 
	 }
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
		System.out.print(fib(i)+" ");
		}
	}
}
*/