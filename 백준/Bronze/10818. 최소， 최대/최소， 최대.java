import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		
		int max = input.nextInt();
		int min = max;
		
		for (int i = 1; i < N; i++) {
			int tmp = input.nextInt();
			if (max < tmp) max = tmp;		
			if (min > tmp) min = tmp;		
		}
		
		System.out.println(min + " " + max);
		
		input.close();
	}

}
