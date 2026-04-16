import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int test_case = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_case; i++) {
			int market_num = Integer.parseInt(br.readLine());
			int [] market_list = new int [market_num]; 
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < market_num; j++) {
				market_list[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(market_list);
			
			int mid = market_num / 2;
			int result = (2*(Math.abs(market_list[mid]-market_list[0])) + 
					2*(Math.abs(market_list[mid]-market_list[market_num-1])));
			
			bw.write(Integer.toString(result));
			bw.newLine();
		}
		bw.flush();
		bw.close();

	}

}

