import java.util.Scanner;

public class DataStructuresMain {
	
	private static void printHead(boolean excel){
		POut.beginTableRow(excel);
		System.out.print("np");
		POut.separatorTableRow(excel);
		System.out.print("C_B");
		POut.separatorTableRow(excel);
		System.out.print("S_sB");
		POut.separatorTableRow(excel);
		System.out.print("S_bB");
		POut.separatorTableRow(excel);
		System.out.print("C_L");
		POut.separatorTableRow(excel);
		System.out.print("S_L");
		POut.separatorTableRow(excel);
		System.out.print("C_TR");
		POut.separatorTableRow(excel);
		System.out.print("H_TR");
		POut.separatorTableRow(excel);
		System.out.print("S_TR");
		POut.separatorTableRow(excel);
		System.out.print("C_TB");
		POut.separatorTableRow(excel);
		System.out.print("H_TB");
		POut.separatorTableRow(excel);
		System.out.print("S_TB");
		POut.endTableRow(excel);
	}
	
	public static void main(String[] args){
		
		int repeats, sizeOfFirstInstance, step = 0;
		int[] array;
		boolean loop, excel;
		Scanner scan = new Scanner(System.in);
		String input;
		
		System.out.println("\nData Structures Comprasion Project");
		System.out.println("created by Wojciech Handke and Filip Gapczynski\n");
		System.out.println("Please, resize your terminal to be as wide as possible, thank you.\n");
		
		do{
			System.out.print("Set size of first instance: ");
			sizeOfFirstInstance = scan.nextInt();
			
			System.out.print("Set number of instances: ");
			repeats = scan.nextInt();
			
			if(repeats != 1){
				System.out.print("Set step size: ");
				step = scan.nextInt();
			}
			
			System.out.print("Do you want your results to be ready for Excel? (y/n): ");
			input = scan.next();
			if(input.equals("n"))
				excel = false;
			else excel = true;
			
			printHead(excel);
			

				
			for(int i = 0; i < repeats; i++){
				int sizeOfInstance = sizeOfFirstInstance + (i * step);
				array = new int[sizeOfInstance];
				ArrayGenerator.generate(array);
				Test.run(array, i, excel);
			}
			
			
			System.out.print("\n\nDo you wish to start again? (y/n): ");
			input = scan.next();
			if(input.equals("y"))
				loop = true;
			else loop = false;
		}while(loop);
	}
}
