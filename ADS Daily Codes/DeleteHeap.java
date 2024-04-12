/*
	class DeleteHeap{
		static void heapify(int arr[], int n, int i){
			int largest = i;
			int l = 2*i+1;
			int r = 2*i+2;
			
			if(l<n && arr[l]>arr[largest])
				largest = l;
			if(r<n && arr[r]>arr[largest])
				largest = r;
				
			if(largest != i){
				int temp = arr[i];
				arr[i] = arr[largest];
				arr[largest] = temp;
				
				heapify(arr, n, largest);
			}
		}
		static void heapsort( int arr[] ){
			int n = arr.length;
			for(int i = n/2-1; i>=0; i--){
				heapify(arr, n, 0);
			}
		for(int i=n-1;i>0;i--){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;		
			heapify(arr, i, 0);
		}
	}
	  static int deleteRoot(int arr[], int n){
		int lastElement = arr[n - 1];
		arr[0] = lastElement;
		n = n - 1;
        heapify(arr, n, 0);
        return n;
    }
	
	static void display(int arr[], int n){
		int x = arr.length;
		for(int i=0;i<x;i++){
			System.out.print(arr[i] + " ");
		}
	}	
		public static void main(String args []){
			DeleteHeap h1 = new DeleteHeap();
			int arr[ ] ={11, 55, 33, 88, 44, 22};
			int n = arr.length;
			display(arr, n);
			System.out.println();
			heapsort(arr);
			n = deleteRoot(arr, n);
			display(arr, n-1);
		}
	}
*/
 class DeleteHeap {

    static void heapify(int arr[], int n, int i){
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
		static void heapsort( int arr[] ){
			int n = arr.length;
			for(int i = n/2-1; i>=0; i--){
				heapify(arr, n, 0);
			}
		for(int i=n-1;i>0;i--){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;		
			heapify(arr, i, 0);
		}
	}
	
    static int delete(int arr[], int n){
        int lastElement = arr[n - 1];
        arr[0] = lastElement;
        n = n - 1;
        heapify(arr, n, 0);
        return n;
    }

    static void display(int arr[], int n){
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
     public static void main(String args[]){
        int arr[ ] ={11, 55, 33, 88, 44, 22};
        int n = arr.length;
		heapsort(arr);
		display(arr, n);
		System.out.println();
        n = delete(arr, n);
		heapsort(arr);
        display(arr, n);
    }
}