import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		int [][] A = new int [n][m];
		int [][] B = new int [n][m];

		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) 
				A[i][j] = input.nextInt();	

		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) 
				B[i][j] = input.nextInt();		

		int [][] C = new int [n][m];

		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) 
				C[i][j] = A[i][j] + B[i][j];		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) 
				System.out.print(C[i][j] + " ");			
			System.out.println();
		}

		input.close();
	}

}
