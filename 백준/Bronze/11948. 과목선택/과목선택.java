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

		int [] score = new int [6];
		
		for (int i = 0; i < 6; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		int science_min = score[0];
		int science_min_idx = 0;
		
		for (int i = 1; i < 4; i++) {
			if (science_min > score[i]) {
				science_min = score[i];
				science_min_idx = i;
			}
		}
		
		int social_min = score[4];
		int social_min_idx = 4;
		
		if (social_min > score[5]) {
			social_min = score[5];
			social_min_idx = 5;
		}
		
		int sum = 0;
		
		for (int i = 0; i < 6; i++) {
			if (i != social_min_idx && i != science_min_idx) {
				sum += score[i];
			}
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();

	}

}

