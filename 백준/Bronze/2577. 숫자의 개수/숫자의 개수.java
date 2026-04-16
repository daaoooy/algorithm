import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();

		int mult = A * B * C;

		int [] check = new int [10];

		String [] s = (Integer.toString(mult)).split("");

		for (int i = 0; i < s.length; i++) {
			switch(s[i]) {
			case "0": check[0] += 1; break;
			case "1": check[1] += 1; break;
			case "2": check[2] += 1; break;
			case "3": check[3] += 1; break;
			case "4": check[4] += 1; break;
			case "5": check[5] += 1; break;
			case "6": check[6] += 1; break;
			case "7": check[7] += 1; break;
			case "8": check[8] += 1; break;
			case "9": check[9] += 1; break;		
			}
		}
		
		for (int i = 0; i < 10; i++) System.out.println(check[i]);

		input.close();
	}

}
