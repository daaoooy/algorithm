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
		
		for (int i = 0; i < n+2; i++) {
			for (int j = 0; j < n+2; j++) {
				if (i==0 || i==n+1) {
					bw.write("@");
				}
				else {
					if (j==0 || j==n+1) {
						bw.write("@");
					}
					else {
						bw.write(" ");
					}
				}
			}
			bw.newLine();
		}
			
		bw.flush();
		bw.close();

	}

}

