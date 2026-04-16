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
		
		String [] str_a = (st.nextToken()).split("");
		String [] str_b = (st.nextToken()).split("");
		
		StringBuilder change_a = new StringBuilder();
		StringBuilder change_b = new StringBuilder();
		
		for (int i = 2; i >= 0; i--) {
			change_a.append(str_a[i]);
			change_b.append(str_b[i]);
		}
		
		int int_a = Integer.parseInt(change_a.toString());
		int int_b = Integer.parseInt(change_b.toString());
		
		bw.write(Integer.toString(Math.max(int_a, int_b)));	
				
		bw.flush();
		bw.close();
		
	}

}

