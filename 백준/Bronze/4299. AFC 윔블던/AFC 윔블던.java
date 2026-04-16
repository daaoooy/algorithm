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

		int sum = Integer.parseInt(st.nextToken());
		int sub = Integer.parseInt(st.nextToken());

		if (sum < sub) {
			bw.write("-1");
		}
		else {
			if ((sum + sub) % 2 == 0) {
				int team1 = (sum + sub) / 2;
				int team2 = sum - team1;
				if (team1 > team2) {
					bw.write(Integer.toString(team1) + " " + Integer.toString(team2));
				}
				else {
					bw.write(Integer.toString(team2) + " " + Integer.toString(team1));
				}
			}
			else {
				bw.write("-1");
			}
		}

		bw.flush();
		bw.close();

	}

}

