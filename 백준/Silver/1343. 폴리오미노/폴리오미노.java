import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		StringBuilder result = new StringBuilder();

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == 'X') {
				count++; 
			} else {
				if (count > 0) {
					if (count % 2 != 0) {
						System.out.println("-1");
						return;
					}
					result.append("AAAA".repeat(count / 4));
					result.append("BB".repeat((count % 4) / 2));
				}
				result.append(".");
				count = 0;
			}
		}

		if (count > 0) {
			if (count % 2 != 0) {
				System.out.println("-1");
				return;
			}
			result.append("AAAA".repeat(count / 4));
			result.append("BB".repeat((count % 4) / 2));
		}

		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
}

