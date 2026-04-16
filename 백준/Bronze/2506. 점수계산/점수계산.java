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

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] score = new int [n];
		
		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		int cont = 0;
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			if (score[i] == 1) {
				cont ++;
				total += cont;
				
			}
			else if (score[i] == 0) {
				cont = 0;
			}
		}
		
		bw.write(Integer.toString(total));
		bw.flush();
		bw.close();

	}

}

