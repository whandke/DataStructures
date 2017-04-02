public class ArraysSearchLinear  {
	
	public static void input(int[] arrayA, int[] arrayB){//input to przerobiony sort, arrayB to posortowane tablica A, zak³adam ¿e bêdziemy to robiæ gdzieœ "na zewn¹trz"
		long n = arrayA.length;
		int x;
		for (int i = 0; i < n-1; i++){
			x = arrayA[i];
			for (int j = 0; arrayB[j] != x; j++);		
		}
	}

}
