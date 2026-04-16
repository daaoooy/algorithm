import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int sum = n*n;
		
		for (int i = 1; i < 5; i++) {
			n = input.nextInt();
			sum += n*n;
		}
		
		int result = sum % 10;
		System.out.println(result);
		
		input.close();
	}

}
