
class Rec5 {
     
    static void mul(int n, int i){ 
        if (i > 10)     
		return ;		
        System.out.println(n + " * " + i + " = " + n * i); 
				
		mul(n, i + 1); 
    } 
     
    public static void main (String[] args){ 
        int n = 8; 
        mul(n, 1); 
    } 
}

//through scanner
/*
import java.util.Scanner;
class Rec5 {
     
    static void mul(int n, int i) 
    { 
        if (i > 10)     
		return ;		
        System.out.println(n + " * " + i + " = " + n * i); 
				
		mul(n, i + 1); 
    } 
     
    public static void main (String[] args) 
    { 
        
		Scanner sc = new Scanner(System.in );
		System.out.print("Enter Number : ");
		int n = sc.nextInt(); 
        mul(n, 1); 
    } 
}
*/