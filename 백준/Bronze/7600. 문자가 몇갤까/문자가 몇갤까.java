import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		while (!str.equals("#")) {
			str = str.toLowerCase();
			String [] input = str.split("");

			Set<String> HashSet = new HashSet<>();

			for (String i : input) {
				HashSet.add(i);
			}

			String [] alpha = new String [HashSet.size()];

			int index = 0;
			for (String i : HashSet) {
				alpha[index++] = i;
			}

			int result = 0;

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < alpha.length; i++) {
				sb.append(alpha[i]);
			}

			String s = sb.toString();

			for (int i = 0; i < s.length(); i++) {
				if (97 <= ((int)s.charAt(i)) && 
						122 >= ((int)s.charAt(i))) {
					result ++;
				}
			}

			bw.write(Integer.toString(result));
			bw.newLine();

			str = br.readLine();
		}

		bw.flush();
		bw.close();

	}

}

