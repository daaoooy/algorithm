import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int [] alpha = new int [26];
		
		String str = "";
		
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					alpha[str.charAt(i)-97] ++;
				}
			}
		}
		
		int max_idx = 0;
		int max_value = alpha[0];
		
		for (int i = 1; i < alpha.length; i++) {
			if (max_value < alpha[i]) {
				max_value = alpha[i];
				max_idx = i;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			if (max_value == alpha[i]) {
				bw.write((char)(i + 97));
			}
		}
		
		bw.flush();
		bw.close();

	}

}

