import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int case_num = input.nextInt();

		for(int t = 0; t < case_num; t++) {
			int [][] dp = new int [15][15];

			for (int i = 1; i < 15; i++) {
				dp[0][i] = i;
				dp[i][1] = 1;
			}

			for (int i = 1; i < 15; i++) {
				for (int j = 2; j < 15; j++) {
					dp[i][j] = dp[i][j-1] + dp[i-1][j];
				}
			}
			int k = input.nextInt();
			int n = input.nextInt();
			
			System.out.println(dp[k][n]);
		}

		input.close(); 
	}

}
