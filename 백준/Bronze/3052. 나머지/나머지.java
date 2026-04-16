import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] ip = new int [10];
		
		for (int i = 0; i < 10; i++) 
			ip[i] = (input.nextInt()) % 42;
		
		ip = Arrays.stream(ip).distinct().toArray();
		
		System.out.println(ip.length);
		
		input.close();
	}

}
