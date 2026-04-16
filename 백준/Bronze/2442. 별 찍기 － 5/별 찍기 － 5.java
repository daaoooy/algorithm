import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++)
				System.out.print(" ");
			for (int k = 0; k < 2*i+1; k++) 
				System.out.print("*");	
			System.out.println();
		}
		
		input.close();
	}

}
