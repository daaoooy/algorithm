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

		int [] input = new int [4];
		int [] output = new int [4];
		int [] person = new int [4];
		
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			output[i] = Integer.parseInt(st.nextToken());
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		person[0] = input[0];
		
		for (int i = 1; i < 4; i++) {
			person[i] = person[i-1] - output[i] + input[i];
		}
		
		int max = person[0];
		
		for (int i = 1; i < 4; i++) {
			if (max < person[i]) {
				max = person[i];
			}
		}
		
		bw.write(Integer.toString(max));

		bw.flush();
		bw.close();

	}

}

