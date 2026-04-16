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

		int [] input = new int [7];

		for (int i = 0; i < 7; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < 7; i++) {
			if (input[i] % 2 != 0) {
				sum += input[i];
				cnt ++;
			}
		}

		if (cnt > 0) {
			int [] odd = new int [cnt];
			int tmp = 0;

			for (int i = 0; i < 7; i++) {
				if (input[i] % 2 != 0) {
					odd[tmp++] = input[i];
				}
			}

			int min = odd[0];

			for (int i = 1; i < cnt; i++) {
				if (min > odd[i]) {
					min = odd[i];
				}
			}

			bw.write(Integer.toString(sum));
			bw.newLine();
			bw.write(Integer.toString(min));
		}
		else {
			bw.write("-1");
		}

		bw.flush();
		bw.close();

	}

}

