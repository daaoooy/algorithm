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
		
		int [] check = new int [31];
		check[0] = 1;
		for (int i = 1; i < 31; i++) check[i] = 0;
		
		for (int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			check[n] = 1;
		}
		
		for (int i = 1; i < 31; i++) {
			if (check[i] == 0) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
	
		}
				
		bw.flush();
		bw.close();
		
	}

}

