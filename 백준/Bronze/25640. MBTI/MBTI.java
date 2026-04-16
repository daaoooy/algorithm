import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String jinho = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		int same = 0;
		for (int i = 0; i < n; i++) {
			String mbti = br.readLine();
			
			if (jinho.equals(mbti)) {
				same ++;
			}
		}
		bw.write(Integer.toString(same));
		
		bw.flush();
		bw.close();

	}

}

