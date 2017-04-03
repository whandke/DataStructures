import java.util.Random;

public class ArrayGenerator {
	
	private static void swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;		
	}
	
	public static void random(int[] array){	
		int length = array.length;
		Random rn = new Random();
		for(int i = 0; i < length; i++){
			array[i] = rn.nextInt(length);
		}
	}

	public static void rising(int[] array){
		for(int i = 0; i < array.length; i++)
			array[i] = i + 1;
	}
	
	public static void vShape(int[] array, int maximum){
		int lenght = maximum /2;
		for(int i = 0; i < lenght; i++)
			array[i] = lenght - i;
		for(int i = 0; i < lenght; i++)
			array[i + lenght] = i + 1;
	}
	
	public static void aShape(int[] array, int maximum){
		int lenght = maximum /2;
		for(int i = 0; i < lenght; i++)
			array[i + lenght] = lenght - i;
		for(int i = 0; i < lenght; i++)
			array[i] = i + 1;
	}
	
	public static void generate(int[] array){
		int length = array.length;
		int[] rising = new int[length];
		int[] random = new int[length];
		
		rising(rising);
		random(random);
		
		for(int i = 0; i < length; i++)
			swap(rising, i, random[i]);
		for(int i = 0; i < length; i++)
			array[i] = rising[i];
		
		
	}

}
