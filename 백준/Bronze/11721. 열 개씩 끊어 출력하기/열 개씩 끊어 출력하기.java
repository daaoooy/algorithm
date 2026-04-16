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
		
		int start_index = 0;
		int last_index = 10;
		
		while (str.length() >= start_index) {		
			if (last_index >= str.length()) last_index = str.length();
			
			bw.write(str.substring(start_index, last_index));
			bw.newLine();
			
			start_index += 10;
			last_index += 10;
		}
		
		bw.flush();
		bw.close();
		
	}

}

