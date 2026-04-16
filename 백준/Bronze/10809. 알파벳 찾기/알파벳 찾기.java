import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] checklist = new int [26];
		
		String word = input.nextLine();
		
		for (int i = 0; i < checklist.length; i++) 
			checklist[i] = -1;

		for (int i = 0; i < word.length(); i++) 
			if (checklist[(int) word.charAt(i) - 97] == -1) 
				checklist[(int) word.charAt(i) - 97] = i;
			
		for (int i = 0; i < checklist.length; i++)
			System.out.print(checklist[i] + " ");
		
		input.close(); 
	}

}
