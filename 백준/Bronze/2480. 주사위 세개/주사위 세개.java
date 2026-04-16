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
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		
		if (a == b && b == c) {
			sum = 10000 + (a * 1000);
			bw.write(Integer.toString(sum));
		}
		else if ( (a == b && b != c) || (a == c && b != c) ) {
			sum = 1000 + (a * 100);
			bw.write(Integer.toString(sum));
		}
		else if ( a != b && b == c) {
			sum = 1000 + (b * 100);
			bw.write(Integer.toString(sum));
		}
		else {
			int max = Math.max(a, b);
			if (max < c) max = c;
			sum = max * 100;
			bw.write(Integer.toString(sum));
		}

		bw.flush();
		bw.close();
		
	}

}

