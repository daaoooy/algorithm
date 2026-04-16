import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int three = 3;

		while (three > 0) {
			three --;

			int n = input.nextInt();
			BigInteger result = new BigInteger("0");
			BigInteger compare = new BigInteger("0");

			for (int i = 0; i < n; i++) 
				result = result.add(input.nextBigInteger());	

			if (result.compareTo(compare) > 0) System.out.println("+");
			else if (result.compareTo(compare) < 0) System.out.println("-");
			else System.out.println("0");
		}

		input.close();
	}
}
