
public class DataStructuresMain {
	
	public static void main(String[] args){
		
		int repeats;
		int sizeOfInstance;
		
		System.out.println("\nData Structures Comprasion Project");
		System.out.println("created by Wojciech Handke and Filip Gapczynski\n");
		System.out.println("Please, resize your terminal to be as wide as possible, thank you.\n");
		
		int arrayLength = 10;
		
		int[] arrayA = new int[arrayLength];
		int[] arrayB = new int[arrayLength];
		int[] arrayC = new int[arrayLength];
		
		ArrayGenerator.rising(arrayA);
		ArrayGenerator.generate(arrayB);
		
		ArrayOperations.binarySpreadArray(arrayA, arrayC);
		ArrayOperations.printOut(arrayC);
		
		
		
	}
}
