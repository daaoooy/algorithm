import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int [] num = new int [n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		int sum;
		int result = 0;

		int find = 0;

		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					sum = num[i] + num[j] + num[k];
					if (sum == m) {
						find = 1;
						result = sum;
					} 
					else if (sum < m && result < sum) {
						result = sum;
					}
				}
				if (find == 1) break;
			}
			if (find == 1) break;
		}

		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
		br.close();
	}

}

