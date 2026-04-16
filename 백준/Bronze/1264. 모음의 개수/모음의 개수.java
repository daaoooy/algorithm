import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = "";
		int count = 0;
		String ip = "";
		
		while (!str.equals("#")) { 
			str = input.nextLine();
			count ++;
			ip += str.toLowerCase();
		}
		
		count --;
		
		String [] strArr = ip.split("\\.|!|\\?");
		int [] result = new int[count];
		
		for (int i = 0; i < count; i++) {
			int c = 0;
			for (int j = 0; j < strArr[i].length(); j++) {
				if (strArr[i].charAt(j) == 'a' | 
					strArr[i].charAt(j) == 'e' |
					strArr[i].charAt(j) == 'i' |
					strArr[i].charAt(j) == 'o' |
					strArr[i].charAt(j) == 'u') {
					c ++;
				}
			}
			result[i] = c;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}