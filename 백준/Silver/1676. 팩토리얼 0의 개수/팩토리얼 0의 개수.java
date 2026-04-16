import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		BigInteger fact = new BigInteger("1");	
		BigInteger n = new BigInteger(br.readLine());
		
		// BigInteger bigZero = BigInteger.ZERO;
		BigInteger bigOne = BigInteger.ONE;
		
		while (n.compareTo(bigOne) == 1) {
			fact = fact.multiply(n);
			n = n.subtract(bigOne);
		}
		
		// bw.write(fact.toString() + "\n");
		
		int zero = 0;
		String str = fact.toString();
		
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == '0') {
				zero += 1;
			} else {
				break;
			}
		}
		
		bw.write(Integer.toString(zero));
		bw.flush();
		bw.close();
		br.close();
	}
}
