
class D2Que10{

static void fibo(int n, int a, int b){
    if (n > 0) {
        fibo(n - 1, b, a + b);
        System.out.print(a + " ");
    }
}
	public static void main(String args[]){
		int N = 5;
		fibo(N, 0, 1);
	}
}