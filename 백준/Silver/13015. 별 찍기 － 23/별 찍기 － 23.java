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
		int k = 1;
		
		for (int i = 0; i < 2*n-1; i++) {
			if (i < n-1) {
				for (int j = 0; j < i; j++) {
					bw.write(" ");
				}
				if (i == 0) {
					for (int j = 0; j < 4*n-3; j++) {
						if (j >= 0 && j < n) bw.write("*");
						else if (j <= 4*n-4 && j > (4*n-4)-n) bw.write("*");
						else bw.write(" ");
					}
				}
				else {
					for (int j = 0; j < 4*n-(3+2*i); j++) {
						if (j == 0 || j == n-1 || j == 4*n-(3+2*i)-1 || j == 4*n-(3+2*i)-n) {
							bw.write("*");
						}
						else {
							bw.write(" ");
						}
					}
				}
				bw.newLine();
			}

			else if (i == n - 1) { 
				for (int j = 0; j < n-1; j++) {
					bw.write(" ");
				}
				for (int j = 0; j < 2*n-1; j++) {
					if (j == 0 || j == (2*n-1) / 2 || j == 2*n-2) {
						bw.write("*");
					}
					else {
						bw.write(" ");
					}
				}
				bw.newLine();
			}

			else {
				for (int j = i-2*k; j > 0; j--) {
					bw.write(" ");
				}
				
				if (i == 2*n-2) {
					for (int j = 0; j < 4*n-3; j++) {
						if (j >= 0 && j < n) bw.write("*");
						else if (j <= 4*n-4 && j > (4*n-4)-n) bw.write("*");
						else bw.write(" ");
					}
				}
				else {
					for (int j = 0; j < 2*n + (2*k-1); j++) {
						if (j == 0 || j == n-1 || j == 2*n + (2*k-1)-1 || j == 2*n + (2*k-1)-n) {
							bw.write("*");
						}
						else {
							bw.write(" ");
						}
					}
				}
				k++;
				bw.newLine();
			}

		}

		bw.flush();
		bw.close();

	}

}

