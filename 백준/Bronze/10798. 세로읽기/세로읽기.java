import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [][] input = new String [5][15];
		
		for (int i = 0; i < 5; i++) {
			String line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				input[i][j] = Character.toString(line.charAt(j));
			}
			for (int j = line.length(); j < 15; j++) {
				input[i][j] = "";
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				bw.write(input[j][i]);
			}
		}

		bw.flush();
		bw.close();

	}

}

