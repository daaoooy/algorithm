import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String ip = br.readLine();
			
			String str_day = ip.substring(2);
			int day = Integer.parseInt(str_day);
			
			if (day <= 90) cnt ++;
			
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();

	}

}

