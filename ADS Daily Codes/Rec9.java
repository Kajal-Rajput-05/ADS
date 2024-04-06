
class Rec9{
    static void rev(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        
		else{
            System.out.print(str.charAt(str.length()-1));
            rev(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
        String str = "Hello Cdac";
        Rec9 obj = new Rec9();
        obj.rev(str);
    }    
}

//through scanner
/*
import java.util.Scanner;
class Rec9{
    static void rev(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        
		else{
            System.out.print(str.charAt(str.length()-1));
            rev(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value : ");
        String str = sc.nextLine();
        Rec9 obj = new Rec9();
        obj.rev(str);
    }    
}
*/