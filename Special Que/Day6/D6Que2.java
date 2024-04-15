 
 class D6Que2{
	 static int search(int arr[], int l, int r, int key){
		if(r>=l){
			int mid = l+(r-1)/2;
			if(arr[mid] == key)
				return mid;
			if(arr[mid] > key)
				return search(arr, l, mid-1, key);
				
			return search(arr, mid+1, r, key);
		}
		return -1;
	 }
	 
	 public static void main(String args [] ){
		int arr[] = { 11, 22, 33, 44, 55, 88 };
		int x = 55;
		int n = arr.length;
		int result = search(arr, 0, n-1, x);
		if(result == -1)
			System.out.println("Element not present in the List");
		else
			System.out.println("Element "+ x +" : " + result );
			
		
	} 
}
 