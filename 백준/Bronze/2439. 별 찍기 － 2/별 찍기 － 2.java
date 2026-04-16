import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (N-i-1> j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		input.close();
	}

}
