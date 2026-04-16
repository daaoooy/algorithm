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
		
		int [] score = new int [10];
		int total = 0;
		int [] sum = new int [10];
		
		for (int i = 0; i < 10; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < score.length; i++) {
			total += score[i];
			sum[i] = total;
		}
		
		int [] gap = new int [10];
		
		for (int i = 0; i < sum.length; i++) {
			gap[i] = Math.abs(100-sum[i]);
		}
		
		int min = gap[0];
		int min_idx = 0;
		
		for (int i = 1; i < gap.length; i++) {
			if (min >= gap[i]) {
				min = gap[i];
				min_idx = i;
			}
		}
		
		bw.write(Integer.toString(sum[min_idx]));
		
		bw.flush();
		bw.close();

	}

}

