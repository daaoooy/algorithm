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

		int [] players = new int [5];
		
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			players[i] = sum;
		}
		
		int max = players[0];
		int max_idx = 0;
		
		for (int i = 0; i < 5; i++) {
			if (max < players[i]) {
				max = players[i];
				max_idx = i;
			}
		}
		
		bw.write(Integer.toString(max_idx+1) + " " + Integer.toString(max));
		
		bw.flush();
		bw.close();

	}

}

