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

		for (int i = 0; i < 4*n-3; i++) {	
			if (i <= (4*n-3) / 2) {			
				if (i % 2 == 0) {
					for (int j = 0; j < 4*n-3; j++) {
						if (j >= i && j < (4*n-3) - i) bw.write("*");
						else if (i > j) {
							bw.write("* ");
							j++;
						}
						else if (j >= (4*n-3) - i) {
							bw.write(" *");
							j++;
						}
					}
				}				
				else {
					for (int j = 0; j < 4*n-3; j++) {
						if ((j % 2 == 0 && j < i) || (j % 2 == 0 && j >= (4*n-3)-i)) {
							bw.write("*");
						}
						else {
							bw.write(" ");
						}
					}
				}
			}
			
			else {				
				if (i % 2 == 0) {
					for (int j = 4*n-4; j >= 0; j--) {
						if (j <= i && j >= ((4*n-3) - i)-1) bw.write("*");
						else if (i < j) {
							bw.write("* ");
							j--;
						}
						else if (j < ((4*n-3) - i)-1) {
							bw.write(" *");
							j--;
						}
					}
				}
							
				else {
					for (int j = 4*n-4; j >= 0; j--) {
						if ((j % 2 == 0 && j >= i) || (j % 2 == 0 && j < (4*n-3)-i)) {
							bw.write("*");
						}
						else {
							bw.write(" ");
						}
					}
				}
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

