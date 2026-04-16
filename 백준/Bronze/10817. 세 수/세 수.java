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
		
		if (Math.max(a, b) <= c) {
			bw.write(Integer.toString(Math.max(a, b)));
		}
		else if (Math.min(a, b) > c) {
			bw.write(Integer.toString(Math.min(a,  b)));
		}
		else if (Math.max(a, c) <= b) {
			bw.write(Integer.toString(Math.max(a, c)));
		}
		else if (Math.min(a, c) > b) {
			bw.write(Integer.toString(Math.min(a, c)));
		}
		else if (Math.max(b, c) <= a) {
			bw.write(Integer.toString(Math.max(b, c)));
		}
		else if (Math.min(b, c) > a) {
			bw.write(Integer.toString(Math.min(b, c)));
		}
		
		bw.flush();
		bw.close();
		
	}

}

