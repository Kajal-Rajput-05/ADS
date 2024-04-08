class D1Que5 {
    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
    public static void main(String args[]){
		int num = 4;
        if (isPrime(num))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}