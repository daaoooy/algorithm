import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		while(A != 0 && B != 0) {
			System.out.println(A + B);
			A = input.nextInt();
			B = input.nextInt();
		}
		
		input.close();
	}

}
