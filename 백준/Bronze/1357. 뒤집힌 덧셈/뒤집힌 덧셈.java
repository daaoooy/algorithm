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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String origin_A = st.nextToken();
		String origin_B = st.nextToken();
		
		String Reverse_A = "";
		String Reverse_B = "";
		
		for (int i = origin_A.length()-1; i >= 0; i--) {
			Reverse_A += origin_A.charAt(i);
		}
		
		for (int i = origin_B.length()-1; i >= 0; i--) {
			Reverse_B += origin_B.charAt(i);
		}
		
		String sum = Integer.toString(Integer.parseInt(Reverse_A) + Integer.parseInt(Reverse_B));		
		String reverse_sum = "";
		
		for (int i = sum.length()-1; i >= 0; i--) {
			reverse_sum += sum.charAt(i);
		}
		
		bw.write(Integer.toString(Integer.parseInt(reverse_sum)));
		
		bw.flush();
		bw.close();

	}

}

