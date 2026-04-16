import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] w = new int [10];
		int [] k = new int [10];
		
		for (int i = 0; i < 10; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < 10; i++) {
			k[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		
		int w_score = 0;
		int k_score = 0;
		
		for (int i = 7; i < 10; i++) {
			w_score += w[i];
			k_score += k[i];
		}
		
		bw.write(Integer.toString(w_score) + " ");
		bw.write(Integer.toString(k_score));
		
		bw.flush();
		bw.close();

	}

}

