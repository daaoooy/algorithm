import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int change = input.nextInt();
		int which = 1;
		
		while (change > 0) {
			change --;
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x != which && y != which) {
				
			}
			else if (x == which || y == which) {
				if (x == which) which = y;
				else if (y == which) which = x;
			}
			
		}
		System.out.println(which);
		input.close();
	}

}
