import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		String input = br.readLine();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || 
					input.charAt(i) == 'e' || 
					input.charAt(i) == 'i' || 
					input.charAt(i) == 'o' || 
					input.charAt(i) == 'u') {
				sb.append(input.charAt(i));
				i += 2;
				continue;
			} else {
				sb.append(input.charAt(i));
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
