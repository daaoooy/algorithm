import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] input = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[i][0] = Integer.parseInt(st.nextToken());
			input[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(input, (e1, e2) -> {
			if (e1[0] == e2[0]) return e1[1] - e2[1];
			else return e1[0] - e2[0];
		});
		
		for (int i = 0; i < n; i++) {
			bw.write(input[i][0] + " " + input[i][1]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}
	
}

