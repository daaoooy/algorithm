import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testcase; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int result = 0;
			
			for (int k = 1; k <= n; k++) {
				int Tn = 0;
				
				for (int t = 1; t <= k+1; t++) {
					Tn += t;
				}
				
				result += k*Tn;			
			}
			
			bw.write(Integer.toString(result));
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

