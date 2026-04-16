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
		
		String name = br.readLine();
		
		int score = 0;
		
		for (int i = 0; i < n; i++) {
			score += name.charAt(i) - 64;
		}
		
		bw.write(Integer.toString(score));
		bw.flush();
		bw.close();

	}

}

