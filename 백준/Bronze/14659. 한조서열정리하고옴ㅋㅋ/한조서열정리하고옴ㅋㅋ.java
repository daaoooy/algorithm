import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int [] hanzo = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayList<Integer> kill = new ArrayList<>();

		for (int i = 0; i < n; i++) 
			hanzo[i] = Integer.parseInt(st.nextToken());

		int cnt = 0;
		int max = hanzo[0];

		for (int i = 1; i < n; i++) {
			if (max < hanzo[i]) {
				kill.add(cnt);
				cnt = 0;
				max = hanzo[i];
			}
			else {
				cnt ++;
				if (i == n-1) {
					kill.add(cnt);
				}
			}
		}
		if (kill.size() == 0) {
			bw.write(Integer.toString(n-1));
		}
		else {
			int kill_max = kill.get(0);
			
			for (int i = 1; i < kill.size(); i++) {
				if (kill_max < kill.get(i)) {
					kill_max = kill.get(i);
				}
			}
			bw.write(Integer.toString(kill_max));
		}

		bw.flush();
		bw.close();

	}

}

