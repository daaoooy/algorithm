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

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();

		String min_a = "";
		String min_b = "";

		String max_a = "";
		String max_b = "";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '5' || a.charAt(i) == '6') {
				min_a += "5";
				max_a += "6";
			}
			else {		
				min_a += a.charAt(i);
				max_a += a.charAt(i);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '5' || b.charAt(i) == '6') {
				min_b += "5";
				max_b += "6";
			}
			else {
				min_b += b.charAt(i);
				max_b += b.charAt(i);
			}
		}

		int max = Integer.parseInt(max_a) + Integer.parseInt(max_b);
		int min = Integer.parseInt(min_a) + Integer.parseInt(min_b);

		bw.write(Integer.toString(min) + " " + Integer.toString(max));

		bw.flush();
		bw.close();

	}

}

