import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		int n = input.nextInt();
		
		System.out.println(str.charAt(n-1));

	}

}
