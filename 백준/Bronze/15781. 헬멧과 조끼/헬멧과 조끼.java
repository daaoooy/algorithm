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
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] head = new int [n];
		int [] body = new int [m];
		
		StringTokenizer ip1 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			head[i] = Integer.parseInt(ip1.nextToken());
		}
			
		StringTokenizer ip2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			body[i] = Integer.parseInt(ip2.nextToken());
		}
		
		int head_max = head[0];
		int body_max = body[0];
		
		for (int i = 1; i < n; i++) {
			if (head_max < head[i]) {
				head_max = head[i];
			}
		}
		
		for (int i = 1; i < m; i++) {
			if (body_max < body[i]) {
				body_max = body[i];
			}
		}
		
		int result = head_max + body_max;
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();

	}

}

