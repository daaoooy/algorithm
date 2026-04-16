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

		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int score = Integer.parseInt(br.readLine());
			
			if (score >= 40) sum += score;
			else {
				score = 40;
				sum += score;
			}
		}
		
		bw.write(Integer.toString(sum / 5));
		
		bw.flush();
		bw.close();

	}

}

