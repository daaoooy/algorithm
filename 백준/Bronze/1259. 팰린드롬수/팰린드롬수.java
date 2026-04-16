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

		// StringTokenizer st = new StringTokenizer(br.readLine());

		String input = br.readLine();

		while (!input.equals("0")) {
			String result = "";
			String front = "";
			String back = "";
			int len = input.length();

			if (input.charAt(0) == '0') {
				result = "no";
			} else {
				// 길이가 짝수일 때
				if (len % 2 == 0) {
					front = input.substring(0, len/2);
					back = input.substring(len/2, len);
				} 
				// 길이가 홀수일 때
				else {
					front = input.substring(0, len/2);
					back = input.substring((len/2)+1, len);
				}

				StringBuilder back_reverse = new StringBuilder(back);
				back_reverse.reverse();

				if (front.equals(back_reverse.toString())) {
					result = "yes";
				} else {
					result = "no";
				}
			}
			bw.write(result + "\n");
			bw.flush();

			input = br.readLine();
		}

		bw.close();
		br.close();
	}

}

