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

		int test_case = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_case; i++) {
			StringTokenizer st = new StringTokenizer (br.readLine());

			int th = Integer.parseInt(st.nextToken());
			String str = st.nextToken();

			StringBuilder sb = new StringBuilder();

			if (th == 1) {
				sb.append(str.substring(1, str.length()));
			}
			else if (th == str.length()) {
				sb.append(str.substring(0, str.length()-1));
			}
			else {
				sb.append(str.substring(0, th-1));
				sb.append(str.substring(th, str.length()));
			}

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

