import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int case_num = input.nextInt();
		
		for (int i = 0; i < case_num; i++) {
			
			int n = input.nextInt();
			String str = input.next();
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(str.charAt(j));
				}
			}
			
			System.out.println();
		}

		
		input.close();
	}

}
