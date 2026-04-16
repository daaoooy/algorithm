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

		// 참가자의 수
		int n = Integer.parseInt(br.readLine());
		
		String [] tmp_t = (br.readLine()).split(" ");
		int [] T = new int [tmp_t.length];
		
		for (int i = 0; i < tmp_t.length; i++) {
			T[i] = Integer.parseInt(tmp_t[i]);
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()); 
		int p = Integer.parseInt(st.nextToken());
		
		int t_result = 0;
		int p_result1 = 0;
		int p_result2 = 0;
		
		for (int i = 0; i < T.length; i++) {
			if (T[i] % t == 0) {
				t_result += T[i] / t;
			} else {
				t_result += (T[i] / t) + 1;
			}
		}
		
		p_result1 = n / p;
		p_result2 = n % p;
		
		bw.write(Integer.toString(t_result) + "\n");
		bw.write(Integer.toString(p_result1) + " " + Integer.toString(p_result2));
		bw.flush();
		
		bw.close();
		br.close();
		
	}

}

