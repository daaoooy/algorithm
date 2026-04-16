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
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			int total = 0;
			String q = br.readLine();
			
			for (int j = 0; j < q.length(); j++) {
				if ((int)q.charAt(j) >= 65 && (int)q.charAt(j) <= 90) {
					total += 4;
				}
				else if ((int)q.charAt(j) >= 97 && (int)q.charAt(j) <= 122) {
					total += 2;
				}
				else if ((int)q.charAt(j) >= 48 && (int)q.charAt(j) <= 57) {
					total += 2;
				}
				else if ((int)q.charAt(j) == 32) {
					total += 1;
				}
			}
			
			if (total <= m) {
				result += 1;
			}
			
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();

	}

}

