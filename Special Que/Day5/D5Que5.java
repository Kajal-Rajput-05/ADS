class D5Que5 {
    static void merge(int arr[], int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
		
        int L[] = new int[n1];
        int R[] = new int[n2];
		
        for (int i=0;i<n1;i++)
            L[i] = arr[l + i];
		
        for (int j= 0;j<n2;j++)
            R[j] = arr[mid + 1 + j];
		
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void msort(int arr[], int l, int r){
        if (l < r) {
            int mid = l + (r - l) / 2;
            msort(arr, l, mid);
            msort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
	 void display(int arr[]){
		int n =arr.length;
		for(int i=0;i<n;i++){
		System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String args[]){
		D5Que5 h1 = new D5Que5();
		int arr[]={ 11, 55, 33, 88, 44, 22, 77 }; 
		h1.display(arr);
		msort(arr, 0, arr.length-1);
		System.out.println();
		h1.display(arr);	
	}	
}