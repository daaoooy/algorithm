import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int change = 0;
		for (int i = 0; i < 5*n; i++) {		
			if (change == 0) {
				for (int j = 0; j < 5*n; j++) {
					if (j < n || j >= 5*n-n) {
						bw.write("@");
					}
					else {
						bw.write(" ");
					}
				}
				bw.newLine();
			}
			else if (change == 1) {
				for (int j = 0; j < 5*n; j++) {
					bw.write("@");
				}
				bw.newLine();
				
			}
			
			if (i % n == n-1 && change == 0) {
				change = 1;
			}
			else if (i % n == n-1 && change == 1) {
				change = 0;
			}
			
		}


		bw.flush();
		bw.close();

	}

}

