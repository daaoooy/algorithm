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
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		double range = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

		for (int i = 0; i < n; i++) {
			int ip = Integer.parseInt(br.readLine());
			
			if (ip <= range) {
				bw.write("DA");
				bw.newLine();
			}
			else {
				bw.write("NE");
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();

	}

}

