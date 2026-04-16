import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int stick = 64;
		int s = 0;
		int count = 0;
		
		while (x > 0) {			
			if (stick > x) 
				stick = stick / 2;		
			else {
				x -= stick;
				count ++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
