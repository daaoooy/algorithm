import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] list = new int[9];

		for (int i = 0; i < 9; i++) list[i] = input.nextInt();

		int max = list[0];
		int max_index = 0;

		for (int i = 1; i < 9; i++) 
			if (max < list[i]) {
				max = list[i];
				max_index = i;
			}

		System.out.println(max);
		System.out.println(max_index+1);

		input.close();
	}

}
