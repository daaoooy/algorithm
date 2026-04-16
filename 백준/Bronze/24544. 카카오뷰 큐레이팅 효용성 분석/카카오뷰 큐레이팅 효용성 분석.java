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
		
		int [] a = new int [n];
		int [] b = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			total += a[i];
		}
		
		int not_contain = 0;
		
		for (int i = 0; i < n; i++) {
			if (b[i] == 0) {
				not_contain += a[i];
			}
		}
		
		bw.write(Integer.toString(total));
		bw.newLine();
		bw.write(Integer.toString(not_contain));
		
		bw.flush();
		bw.close();

	}

}

