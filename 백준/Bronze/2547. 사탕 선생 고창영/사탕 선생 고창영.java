import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		br.readLine();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			
			for (int j = 0; j < n; j++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			
			if ((sum.remainder(new BigInteger(Integer.toString(n)))).equals(new BigInteger("0"))) 
				bw.write("YES");
			else 
				bw.write("NO");
			
			bw.newLine();
			br.readLine();
			
		}
		
		bw.flush();
		bw.close();

	}

}

