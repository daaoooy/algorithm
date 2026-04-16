import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger c = new BigInteger(br.readLine());
		
		String [] mul = ((c.multiply(a.multiply(b))).toString()).split("");
		
		int [] number = new int [10];
		
		for (int i = 0; i < mul.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (Integer.parseInt(mul[i]) == j) {
					number[j]++;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			bw.write(Integer.toString(number[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

