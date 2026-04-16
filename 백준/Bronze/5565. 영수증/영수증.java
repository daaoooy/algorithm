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
		
		int total_price = Integer.parseInt(br.readLine());
		
		int price_9 = 0;
		
		for (int i = 0; i < 9; i++) {
			price_9 += Integer.parseInt(br.readLine());
		}
		
		int result = total_price - price_9;
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();

	}

}

