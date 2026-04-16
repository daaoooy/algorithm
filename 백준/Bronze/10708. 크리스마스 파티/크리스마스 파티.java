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
		int m = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] A = new int [m];
		int [] friend = new int [n];
		
		for (int i = 0; i < m; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int [] list = new int [n];
			
			for (int j = 0; j < n; j++) {
				list[j] = Integer.parseInt(st.nextToken());
			}
			
			int target = A[i];
			
			for (int j = 0; j < n; j++) {
				if (target == list[j]) {
					friend[j] ++;
				}
				else {
					friend[target-1] ++;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			bw.write(Integer.toString(friend[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

