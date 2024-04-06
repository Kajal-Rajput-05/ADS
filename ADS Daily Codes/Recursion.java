public class Recursion {
	static int i=0;
	static void show(){
		++i;
		if(i<=5){
			System.out.println("Hello : "+i);
			show();
		}
	}
	public static void main(String args []){
		show();
	}
}
//This is recursion 
//be careful with the termination condition