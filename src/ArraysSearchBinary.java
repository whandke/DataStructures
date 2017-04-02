public class ArraysSearchBinary {
	
	public static void input (int arrayA[], int arrayB[]){ //input to przerobiony sort
		int low = 0;
		int high = arrayA.length -1;
		
		for (int i=0;i< arrayA.length;i++){
			/* tu musimy doprecyzowaæ, jakie wyszukiwanie robimy.
			 	czy wpisujemy ile elementów ma szukaæ, czy wartoœci
			 	jakie ma szukaæ, czy po prostu wyszukaæ wszystkie 
			 	elementy w drugiej liœcie bez pierdzielenia siê i wypisywania.
				spróbujê napisaæ ten ostatni warunek
			*/
			while (low <= high){
				int middle =(low+high)/2;
				if(arrayA[i]>arrayB[middle]){
					low = middle +1;
				} else if (arrayA[i]< arrayB[middle]){
					high = middle -1;
				}
				//else
					//break w C, nie wiem co w Javie, halp
				
			}
		}
				
	}
}
