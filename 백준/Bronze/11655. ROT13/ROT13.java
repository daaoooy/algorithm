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
		
		String str = br.readLine();
		
		// 소문자 아스키 코드 97 ~ 122
		// 대문자 아스키 코드 65 ~ 90
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i);
			// 소문자일 때
			if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
				tmp += 13;
				if (tmp > 122) {
					tmp -= 122;
					tmp += 96;
				}
				result += (char) tmp;
			}
			// 대문자일 때
			else if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
				tmp += 13;
				if (tmp > 90) {
					tmp -= 90;
					tmp += 64;
				}
				result += (char)tmp;
			}
			
			else if (str.charAt(i) == ' ') result += " ";
			else result += str.charAt(i);
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();

	}

}

