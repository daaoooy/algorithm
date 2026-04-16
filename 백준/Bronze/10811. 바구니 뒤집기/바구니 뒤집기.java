import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] list = new int [n];
		
		for (int i = 1; i <= n; i++) {
			list[i-1] = i;
		}
		
		while (m-- > 0) {
			ArrayList <Integer> tmp = new ArrayList<Integer>();
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int i = a-1; i < b; i++) {
				tmp.add(list[i]);
			}
			
			Collections.reverse(tmp);
			
			for (int i = 0; i < tmp.size(); i++) {
				list[(a-1)+i] = tmp.get(i);
			}
		}
		
		for (int i = 0; i < n; i++) {
			bw.write(Integer.toString(list[i]) + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}

