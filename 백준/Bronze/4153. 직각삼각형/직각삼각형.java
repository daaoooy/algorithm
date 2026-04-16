import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		while (a != 0 && b != 0 && c != 0) {
			if (a < b) {
				if (b < c) { // c가 가장 클 때
					if (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) 
						System.out.println("right");
					else 
						System.out.println("wrong");
				}
				else { // b가 가장 클 때
					if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) 
						System.out.println("right");
					else 
						System.out.println("wrong");
				}
			}
			else {
				if (a < c) { // c가 가장 클 때
					if (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) 
						System.out.println("right");
					else 
						System.out.println("wrong");
				}
				else { // a가 가장 클 때
					if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) 
						System.out.println("right");
					else 
						System.out.println("wrong");
				}
			}
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
		}

		input.close(); 
	}

}
