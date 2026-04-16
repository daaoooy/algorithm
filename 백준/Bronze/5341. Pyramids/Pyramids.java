import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		while (true) {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 0) break;
			else {
				int sum = 0;
				for (int i = 1; i <= n; i++) {
					sum += i;
				}
				bw.write(Integer.toString(sum));
				bw.newLine();
			}
		}
				
		bw.flush();
		bw.close();
		
	}

}

