import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		String reverse_str = sb.toString();
		
		if (str.equals(reverse_str)) bw.write("1");
		else bw.write("0");
		
		bw.flush();
		bw.close();

	}

}

