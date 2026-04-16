import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		while (n != 0) {
			String s = Integer.toString(n);
			int interval = s.length()-1;
			int side = 2;
			int numSize = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') numSize += 4;
				else if (s.charAt(i) == '1') numSize += 2;
				else numSize += 3;
			}
			
			int totalSize = interval + side + numSize;
			System.out.println(totalSize);
			
			n = input.nextInt();
		}
		
		input.close();
	}

}
