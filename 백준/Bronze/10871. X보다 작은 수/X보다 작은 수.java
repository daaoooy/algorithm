import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			int tmp = input.nextInt();
			if (tmp < X) System.out.print(tmp + " ");
		}
		
		input.close(); 
	}

}
