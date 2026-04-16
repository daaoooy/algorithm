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
		int [] minkuck = new int [4];
		
		for (int i = 0; i < 4; i++) {
			minkuck[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int [] manse = new int [4];
		
		for (int i = 0; i < 4; i++) {
			manse[i] = Integer.parseInt(st.nextToken());
		}
		
		int minkuck_total = 0;
		int manse_total = 0;
		
		for (int i = 0; i < 4; i++) {
			minkuck_total += minkuck[i];
			manse_total += manse[i];
		}
		
		if (minkuck_total >= manse_total) bw.write(Integer.toString(minkuck_total));
		else bw.write(Integer.toString(manse_total));
		

		bw.flush();
		bw.close();

	}

}

