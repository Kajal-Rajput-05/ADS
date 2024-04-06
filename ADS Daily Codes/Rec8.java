
public class Rec8{
	static void toh(int n, char s, char inter, char d){
		if(n==1)
			System.out.println(s+" to "+d);	
		else{
			toh(n-1, s, d, inter);
			System.out.println(s+" to "+d);
			toh(n-1, inter, s, d);
		}
	}
	public static void main(String args[]){
		toh(2,'A', 'B', 'C');
	}
}

//HW for 5, 7, 11, 15
/*
formula : 2^n - 1
for 5 = no. of iteraion 31
for 7 = no. of iteraion 127
for 11= no. of iteraion 2047
for 15= no. of iteraion 32767
*/
//through scanner
/*
import java.util.Scanner;
public class Rec8{
	static void toh(int n, char s, char inter, char d){
		if(n==1)
			System.out.println(s+" to "+d);	
		else{
			toh(n-1, s, d, inter);
			System.out.println(s+" to "+d);
			toh(n-1, inter, s, d);
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		toh(sc.nextInt(),'A', 'B', 'C');
	}
}
*/