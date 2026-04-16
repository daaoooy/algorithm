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
		int m = Integer.parseInt(st.nextToken());
		
		String [][] input = new String [n][m];
		
		for (int i = 0; i < n; i++) {
			input[i] = (br.readLine()).split("");
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = m-1; j >= 0; j--) {
				bw.write(input[i][j]);
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

