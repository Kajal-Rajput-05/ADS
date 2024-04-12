
class LinearSearch{
	static int search(int arr[], int x){
		int n = arr.length;
		for(int i=0; i<n; i++){
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	public static void main(String args [] ){
		int arr[] = { 11, 55, 33, 88, 44, 22 };
		int x = 55;
		int result = search(arr, x);
		if(result == -1)
			System.out.println("Element not present in the List");
		else
			System.out.println("Element "+ x +" present in the List at Index " + result );	
	}
}