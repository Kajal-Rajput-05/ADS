
class D2Que3{
    static float mean(int A[], int N){ 
    if (N == 1) 
     return (float)A[N-1]; 
    else
     return((float)(mean(A, N-1)*(N-1) + A[N-1])/N); 
    } 

    public static void main (String[] args){ 
        float Mean = 0; 
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int N = A.length; 
        System.out.println(mean(A, N)); 
    } 
}