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

		int one_cnt = 0;
		int zero_cnt = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			
			if (input.equals("1")) one_cnt ++;
			else if (input.equals("0")) zero_cnt ++;
		}
		
		if (one_cnt > zero_cnt) {
			bw.write("Junhee is cute!");
		}
		else {
			bw.write("Junhee is not cute!");
		}

		bw.flush();
		bw.close();

	}

}

