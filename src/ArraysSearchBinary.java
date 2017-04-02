public class ArraysSearchBinary {
	
	public static void input (int arrayA[], int arrayB[]){ //input to przerobiony sort
		int low = 0;
		int high = arrayA.length -1;
		
		for (int i=0;i< arrayA.length;i++){
			/* tu musimy doprecyzowa�, jakie wyszukiwanie robimy.
			 	czy wpisujemy ile element�w ma szuka�, czy warto�ci
			 	jakie ma szuka�, czy po prostu wyszuka� wszystkie 
			 	elementy w drugiej li�cie bez pierdzielenia si� i wypisywania.
				spr�buj� napisa� ten ostatni warunek
			*/
			while (low <= high){
				int middle =(low+high)/2;
				if(arrayA[i]>arrayB[middle]){
					low = middle +1;
				} else if (arrayA[i]< arrayB[middle]){
					high = middle -1;
				}
				else
					//break w C, nie wiem co w Javie, halp
				
			}
		}
				
	}
}
