import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < N; i++ ) {
			String [] OX = (input.nextLine()).split("");

			int cnt = 0;
			int score = 0;

			for (int j = 0; j < OX.length; j++) {
				if (OX[j].equals("X")) {
					cnt = 0;
				}
				else if (OX[j].equals("O")) {
					cnt += 1;
					score += cnt;
				}
			}

			System.out.println(score);
		}

		input.close();
	}

}
