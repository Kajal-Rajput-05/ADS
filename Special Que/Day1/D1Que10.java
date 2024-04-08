
class D1Que10 { 
    static boolean isAutomorphic(int N){ 
          if(N < 0) N = -N; 
        int sq = N * N; 
        while (N > 0) { 
            if (N % 10 != sq % 10) 
                return false; 
            N /= 10; 
            sq /= 10; 
        } 
        return true; 
    } 
    public static void main(String[] args) { 
        int N = 5; 
        System.out.println(isAutomorphic(N) ? "Yes":"No"); 
    } 
} 