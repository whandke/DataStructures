import java.util.Arrays;

public class Test {
	public static void run(int[] array, int numerTestu, boolean excel){
		POut.beginTableRow(excel);
		System.out.print(String.valueOf(numerTestu));
		
		arrayTest(array, excel);
		listTest(array, excel);
		trTest(array, excel);
		tbTest(array, excel);
		
		POut.endTableRow(excel);
	}
	
	private static void arrayTestOne(int[] array, boolean excel){
		long starts = Timer.set();
		
		int[] testArray = array.clone();
		Arrays.sort(testArray);
		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));
	}
	
	private static void arrayTestTwo(int[] arrayA, int[] arrayB, boolean excel){
		long starts = Timer.set();
		
		ArrayOperations.searchLinearArray(arrayB, arrayA);

		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));
	}
	
	private static void arrayTestThree(int[] arrayA, int[] arrayB, boolean excel){
		long starts = Timer.set();
		
		ArrayOperations.binarySearchArray(arrayB, arrayA);
		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));
	}
	
	private static void arrayTest(int[] arrayA, boolean excel){
		
		POut.separatorTableRow(excel);
		arrayTestOne(arrayA, excel);
		
		int[] arrayB = arrayA.clone();
		Arrays.sort(arrayB);
		
		POut.separatorTableRow(excel);
		arrayTestTwo(arrayB, arrayA, excel);
		
		POut.separatorTableRow(excel);
		arrayTestThree(arrayB, arrayA, excel);
	}
	
	private static void listTestOne(int[] array, LinkedList lista, boolean excel){
		long starts = Timer.set();
		
		lista.addArray(array);
		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));		
	}
	
	private static void listTestTwo(int[] array, LinkedList lista, boolean excel){
		long starts = Timer.set();
		
		lista.findArray(array);
		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));
	}
	
	private static void listTest(int[] array, boolean excel){
		LinkedList lista = new LinkedList();
		
		POut.separatorTableRow(excel);
		listTestOne(array, lista, excel);
		
		POut.separatorTableRow(excel);
		listTestTwo(array, lista, excel);
	}
	
	private static void trTest(int[] array, boolean excel){
		BinarySearchTree bst = new BinarySearchTree();
		POut.separatorTableRow(excel);
		treeTestOne(array, bst, excel);
		POut.separatorTableRow(excel);
		treeTestTwo(bst, excel);
		POut.separatorTableRow(excel);
		treeTestThree(array, bst, excel);
	}
	
	private static void tbTest(int[] array, boolean excel){
		BinarySearchTree bst = new BinarySearchTree();
		int[] arrayB = new int[array.length];
		ArrayOperations.binarySpreadArray(array, arrayB);
		POut.separatorTableRow(excel);
		treeTestOne(arrayB, bst, excel);
		POut.separatorTableRow(excel);
		treeTestTwo(bst, excel);
		POut.separatorTableRow(excel);
		treeTestThree(array, bst, excel);
	}
	
	private static void treeTestOne(int[] array, BinarySearchTree bst, boolean excel){
		long starts = Timer.set();
		
		bst.addArray(array);
		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));
	}
	
	private static void treeTestTwo(BinarySearchTree bst, boolean excel){
		System.out.print(String.valueOf(bst.heightOfTree()));
	}
	
	private static void treeTestThree(int[] array, BinarySearchTree bst, boolean excel){
		long starts = Timer.set();
		
		bst.findFromArray(array);
		
		long ends = Timer.set();
		Timer.printTime(Timer.timeElapsed(starts, ends));
	}

}
