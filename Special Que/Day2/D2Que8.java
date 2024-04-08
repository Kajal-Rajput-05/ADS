
class D2Que8{
static int sum(int []array, int size, int sum){
    if (size == 0) 
        return sum;
    return sum(array, size - 1, sum + array[size - 1]);
}
 
	public static void main(String[] args)
	{
		int array[] = { 11, 22, 33 };
		int size = array.length;
		System.out.print(sum(array, size, 0));
	}
}
