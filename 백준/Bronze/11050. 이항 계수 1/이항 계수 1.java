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

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int result1 = 1;
		
		for (int i = n; i > n-k; i--) {
			result1 *= i;
		}
		
		int result2 = 1;
		
		for (int i = 1; i <= k; i++) {
			result2 *= i;
		}
		
		bw.write(Integer.toString(result1/result2));
		
		bw.flush();
		bw.close();
		br.close();
	}

}

