import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int cnt = 0;
		
		while (true) {
			if (n % 5 == 0 && cnt != 0) {
				System.out.println(cnt + n / 5);
				break;
			}
			else if (n % 5 == 0 && cnt == 0) {
				System.out.println(n / 5);
				break;
			}
			else if (n == 0) {
				System.out.println(cnt);
				break;
			}
			else if (n != 3 && n < 5) {
				System.out.println(-1);
				break;
			}
			n -= 3;
			cnt ++;
		}
		
		input.close(); 
	}

}
