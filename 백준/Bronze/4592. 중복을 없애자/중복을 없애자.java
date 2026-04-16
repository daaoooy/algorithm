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


		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());

			if (n == 0) {
				break;
			}
			else {
				int [] list = new int [n];
				for (int i = 0; i < n; i++) {
					list[i] = Integer.parseInt(st.nextToken());
				}

				StringBuilder sb = new StringBuilder();
				sb.append(list[0] + " ");
				
				for (int i = 1; i < n; i++) {
					if (list[i-1] != list[i]) {
						sb.append(list[i] + " ");
					}
				}
				
				sb.append("$");
				bw.write(sb.toString());
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

	}

}

