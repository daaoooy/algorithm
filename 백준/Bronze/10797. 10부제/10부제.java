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
		
		int date = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int violate = 0;
		
		for (int i = 0; i < 5; i++) {
			if (date == Integer.parseInt(st.nextToken())) {
				violate ++;
			}
		}
		
		bw.write(Integer.toString(violate));
		
		bw.flush();
		bw.close();

	}

}

