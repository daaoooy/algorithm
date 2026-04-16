import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String n = input.nextLine();		
		String [] str = n.split("");
		
		Arrays.sort(str);
		
		for (int i = str.length-1; i >= 0; i--) 
			System.out.print(str[i]);		
		
		input.close();
	}

}
