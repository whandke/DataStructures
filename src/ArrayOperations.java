
public class ArrayOperations {
	
	private static int binarySpreadCounter;
	
	public static void printOut(int[] array){
		System.out.println();
		for(int i = 0; i < array.length; i++)
			System.out.print(String.valueOf(array[i]) + " ");
	}
	
	public static void binarySearchArray(int[] arrayA, int[] arrayB){
		for(int i = 0; i < arrayA.length; i++)
			binarySearch(arrayB, arrayA[i]);
	}

	public static void binarySearch(int[] array, int n){
		binarySearch(array, n, 0, array.length - 1);
	}

	public static void searchLinearArray(int[] arraySearched, int[] arrayFrom){
		for(int i = 0; i < arrayFrom.length - 1; i++)
			searchLinear(arraySearched, arrayFrom[i]);
	}
	
	public static void binarySpreadArray(int[] arrayIn, int[] arrayOut){
		binarySpreadCounter = 0;
		binarySpreadArray(arrayIn, arrayOut, 0, arrayIn.length - 1);
	}
	
	private static void searchLinear(int[] array, int n){
		int lenght = array.length;
		for(int i = 0; i < lenght; i++)
			if(array[i] == n)
				return;
		return;
	}
	
	private static void binarySearch(int[] array, int n, int left, int right){
		int middle = ((left + right) / 2);
		if(array[middle] == n)
			return;
		else if(right - left == 0)
			return;
		else if(n < array[middle])
			binarySearch(array, n, left, middle - 1);
		else if(n > array[middle])
			binarySearch(array, n, middle + 1, right);
	}
	
	private static void binarySpreadArray(int[] arrayIn, int[] arrayOut, int left, int right){
		int middle = ((left + right) / 2);
		arrayOut[binarySpreadCounter] = arrayIn[middle];
		binarySpreadCounter++;
		if(middle > left)
			binarySpreadArray(arrayIn, arrayOut, left, middle - 1);
		if(middle < right)
			binarySpreadArray(arrayIn, arrayOut, middle + 1, right);
	}

}
