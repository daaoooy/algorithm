import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		Queue<Integer> result_q = new LinkedList<>();
		
		while (!q.isEmpty()) {
			int cnt = 1;
			while (cnt < k) {
				q.add(q.poll());
				cnt++;
			}
			result_q.add(q.poll());	
		}
		
		bw.write("<");
		while(!result_q.isEmpty()) {
				if (result_q.size() == 1) {
					bw.write(Integer.toString(result_q.poll()));
				} else {
					bw.write(Integer.toString(result_q.poll()) + ", ");
				}
				
		}
		bw.write(">");
		
		bw.flush();
		bw.close();
		br.close();
	}

}

