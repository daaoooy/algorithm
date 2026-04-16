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
			int [] list = new int [5];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 5; j++) {
				list[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(list);
			
			int total = 0;
			
			for (int j = 1; j < 4; j++) {
				total += list[j];
			}
			
			if (list[3] - list[1] >= 4) {
				bw.write("KIN");
				bw.newLine();
			}
			else {
				bw.write(Integer.toString(total));
				bw.newLine();
			}
			
			
		}
		
		bw.flush();
		bw.close();

	}

}

