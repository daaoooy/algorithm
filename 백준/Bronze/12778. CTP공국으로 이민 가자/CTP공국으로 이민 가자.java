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
		
		int test_case = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test_case; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			if (s.equals("C")) {
				st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j <n; j++) {
					bw.write(((int) (st.nextToken()).charAt(0) -64)+ " ");
				}
			}
			else if (s.equals("N")) {
				st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j <n; j++) {
					bw.write(((char) (Integer.parseInt(st.nextToken())+64)) + " ");
				}
			}
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

