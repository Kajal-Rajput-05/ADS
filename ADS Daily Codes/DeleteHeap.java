 
//delete in min heap
class DeleteHeap {
    static void heapify(int arr[], int n, int i){
        int smallest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
        if (l < n && arr[l] < arr[smallest])
            smallest = l;
        if (r < n && arr[r] < arr[smallest])
            smallest = r;
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            heapify(arr, n, smallest);
        }
    }
	static void heapsort( int arr[] ){
			int n = arr.length;
			for(int i = n/2-1; i>=0; i--){
				heapify(arr, n, i);
			}
		for(int i=n-1;i>0;i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;		
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

//-------------------------------------------
/*
delete in max heap
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
*/
