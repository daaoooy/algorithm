import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int origin_num = input.nextInt();
		int new_num = -1;
		int c = 0;

		while (origin_num != new_num) {
			int tmp, first, second;
			if (c == 0) {
				first = origin_num / 10;
				second = origin_num % 10;		
			}
			else {
				first = new_num / 10;
				second = new_num % 10;
			}
			tmp = first + second;	
			new_num = (second * 10) + (tmp % 10);
			c += 1;
		}
		
		System.out.println(c);
		
		input.close();
	}

}
