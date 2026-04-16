import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String [] input_str = ((input.nextLine()).toLowerCase()).split("");
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(input_str));
		
		String [] check_str = linkedHashSet.toArray(new String[] {});
		int [] check = new int[check_str.length];
		
		for (int i = 0; i < input_str.length; i++) 
			for (int j = 0; j < check_str.length; j++) {
				if (input_str[i].equals(check_str[j])) {
					check[j] ++;
					break;
				}
			}
		
		int max = check[0];
		int max_index = 0;
		
		for (int i = 1; i < check.length; i++) 
			if (max < check[i]) {
				max = check[i];
				max_index = i;
			}
		
		int same = 0;
		
		for (int i = 0; i < check.length; i++) 
			if (check[i] == max) same ++;
		
		if (same > 1) System.out.println("?");
		else System.out.println((check_str[max_index]).toUpperCase());
		
		
		input.close();
	}

}
