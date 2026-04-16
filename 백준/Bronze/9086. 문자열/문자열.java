import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < n; i++) {
			String s = input.nextLine();
			System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1));
		}
		input.close();
	}

}

