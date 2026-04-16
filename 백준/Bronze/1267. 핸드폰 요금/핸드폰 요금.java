import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int [] call = new int[n];
		
		int y = 0;
		int m = 0;
		
		for (int i = 0; i < n; i++) 
			call[i] = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			y += ((call[i]/30)+1) * 10;
			m += ((call[i]/60)+1) * 15;
		}
		
		if (y < m) System.out.println("Y " + y);
		else if (m < y) System.out.println("M " + m);
		else System.out.println("Y M " + y);
		
		input.close();
	}

}
