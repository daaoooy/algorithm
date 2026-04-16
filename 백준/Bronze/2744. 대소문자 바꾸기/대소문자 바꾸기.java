import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) 
				result += (char) (str.charAt(i) + 32);			
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) 
				result += (char) (str.charAt(i) - 32);		
		}
		
		System.out.println(result);
		
		input.close();
	}

}
