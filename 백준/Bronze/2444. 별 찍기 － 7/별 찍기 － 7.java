import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n-1; i >= 1; i--) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 2*i-1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		bw.flush();
		bw.close();

	}
	
}

