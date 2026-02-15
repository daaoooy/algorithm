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
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int sum1 = 0;
		int sum2 = 0;
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		
		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				if (cnt1 == a-1) break;
				else {
					sum1 += i;
					cnt1++;
				}
			}
			if (cnt1 == a ) break;
		}
		
		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				if (cnt2 == b) break;
				else {
					sum2 += i;
					cnt2++;
				}
			}
			if (cnt2 == b) break;
		}
		
		bw.write(Integer.toString(sum2-sum1));
		
		bw.flush();
		bw.close();

	}

}

