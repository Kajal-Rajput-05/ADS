class D5Que6 {
    void qsort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            qsort(arr, low, pi - 1);
            qsort(arr, pi + 1, high);
        }
    }
	int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low; 
        for (int j = high; j > low; j--) {
            if (arr[j] > pivot)
                swap(arr, j, high--);
        }
        swap(arr, low, high);
        return high;
    }
	void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String args[]){
		D5Que6 h1 = new D5Que6();
		int arr[]={ 11, 55, 33, 88, 44, 22 }; 
		h1.display(arr);
		h1.qsort(arr, 0, arr.length-1);
		System.out.println();
		h1.display(arr);	
	}
}