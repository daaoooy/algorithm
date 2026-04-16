import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int f = input.nextInt();

		n -= (n % 100);
		
		while (n % f != 0) 
			n ++;
		
		System.out.println(String.format("%02d", n % 100));
		input.close();
	}
}
