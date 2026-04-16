import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String descending = "87654321";
		String ascending = "12345678";
		
		String str = (input.nextLine()).replace(" ", "");
		
		if (str.equals(descending)) System.out.println("descending");
		else if (str.equals(ascending)) System.out.println("ascending");
		else System.out.println("mixed");
		
		input.close(); 
	}

}
