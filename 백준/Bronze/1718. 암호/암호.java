import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String key = br.readLine();

		int key_check = 0;
		
		StringBuilder result = new StringBuilder();
		
		// 97~122
		for (int i = 0; i < str.length(); i++) {
			// 공백일 때
			if (str.charAt(i) == ' ') {
				result.append(" ");
				if (key_check >= key.length()) {
					key_check = 1;
				}
				else {
					key_check ++;
				}
			}
			// 공백 아닐 때
			else {
				int str_idx = (int) str.charAt(i);
				int key_idx;
				
				if (key_check < key.length()) {
					key_idx = key.charAt(key_check++);
				}
				else {
					key_check = 0;
					key_idx = key.charAt(key_check++);
				}
				
				int print_idx = str_idx - key_idx;
				
				if (print_idx <= 0) {
					print_idx += 26;
				}
				
				result.append((char) (print_idx +96));
				
			}
		}
		
		bw.write(result.toString());

		bw.flush();
		bw.close();

	}

}

