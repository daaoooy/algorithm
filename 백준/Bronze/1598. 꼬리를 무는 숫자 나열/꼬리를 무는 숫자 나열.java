import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		
		int n_w, n_h;
		int m_w, m_h;
		
		if (n % 4 == 0) {
			n_w = n / 4;
			n_h = 4;
		}
		else {
			n_w = (n / 4) + 1;
			n_h = n % 4;
		}
		
		if (m % 4 == 0) {
			m_w = m / 4;
			m_h = 4;
		}
		else {
			m_w = (m / 4) + 1;
			m_h = m % 4;
		}
		
		int w = Math.abs(m_w - n_w);
		int h = Math.abs(m_h - n_h);
		
		System.out.println(w+h);
		
		input.close();
	}

}
