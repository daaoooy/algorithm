import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		
		str = str.strip();
		
		String [] check = str.split(" ");
		
		if (check.length == 1 && check[0] == "") System.out.println(0);
		else System.out.println(check.length);
		
		input.close();
	}

}
