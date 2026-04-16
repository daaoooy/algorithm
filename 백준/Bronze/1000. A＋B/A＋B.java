import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String [] ab = (input.nextLine()).split(" ");
		
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		
		int result = a + b;
		System.out.println(result);
		
		input.close();
	}
}
