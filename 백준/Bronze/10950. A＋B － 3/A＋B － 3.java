import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int case_num = input.nextInt();
		
		for (int i = 0; i < case_num; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			
			System.out.println(A + B);
		}
		
		input.close();
	}

}
