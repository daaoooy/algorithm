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
		int f = Integer.parseInt(st.nextToken());
		
		while (m != 0 && f != 0) {
			int total = m + f;
			bw.write(Integer.toString(total));
			bw.newLine();
			
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			f = Integer.parseInt(st.nextToken());
		}
		

		bw.flush();
		bw.close();

	}

}

