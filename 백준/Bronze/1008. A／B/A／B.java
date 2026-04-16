import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a = input.nextInt();
		double b = input.nextInt();
		
		double result = a / b;
		System.out.println(result);
		
		input.close();
	}

}
