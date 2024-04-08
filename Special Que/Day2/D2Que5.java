
class D2Que5{
    static int sum(int n){ 
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));
    }
	
    public static void main(String args[]){
        int num = 12345;
        int result = sum(num);
        System.out.println("Sum : " + num + " = " + result);
    }
}