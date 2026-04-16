import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		char c = s.charAt(0);
		
		System.out.println((int) c);
		
		input.close();
	}

}
