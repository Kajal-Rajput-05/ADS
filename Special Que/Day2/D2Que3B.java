
public class D2Que3B{ 
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
    static int sum(int A[], int N){ 
        if (N <= 0) 
            return 0; 
        return (sum(A, N - 1) + A[N - 1]); 
    } 
    public static void main(String[] args){ 
        System.out.println(sum(arr, arr.length)); 
    } 
} 
