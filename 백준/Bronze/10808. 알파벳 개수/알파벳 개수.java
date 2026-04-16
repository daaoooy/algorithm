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
		
		int [] check = new int [26];
		
		for (int i = 0; i < check.length; i++) 
			check[i] = 0;
		
		for (int i = 0; i < str.length(); i++) {
			check[str.charAt(i)-97] += 1;
		}
		
		for (int i = 0; i < check.length; i++) {
			bw.write(Integer.toString(check[i]) + " ");
		}
		bw.flush();
		bw.close();

	}

}

