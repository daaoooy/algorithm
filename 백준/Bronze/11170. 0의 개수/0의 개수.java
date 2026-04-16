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
		
		int n = Integer.parseInt(br.readLine());
		
		while (n > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int zero = 0;
			
			for (int i = a; i <= b; i++) {
				String num = Integer.toString(i);
				for (int j = 0; j < num.length(); j++) {
					if (num.charAt(j) == '0') {
						zero ++;
					}
				}
			}
			
			bw.write(Integer.toString(zero));
			bw.newLine();
			
			n--;
		}
		
		bw.flush();
		bw.close();

	}

}

