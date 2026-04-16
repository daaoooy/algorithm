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
		int result;
		
		int r = 2;
		int c = 1;
		
		if (n == 1) {
			result = 1;
		} else {
			while (r <= n) {
				r += 6 * c;
				c++;
			}
			result = c;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		
		bw.close();
		br.close();
		
	}

}

