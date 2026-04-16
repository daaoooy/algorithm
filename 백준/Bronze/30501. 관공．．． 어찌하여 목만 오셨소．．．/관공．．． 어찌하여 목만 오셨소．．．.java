import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		String [] list = new String [n];
		
		for (int i = 0; i < n; i++) {
			list[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {
			if (list[i].contains("S") || list[i].contains("s")) {
				bw.write(list[i]);
				break;
			}
		}
		
		bw.flush();
		bw.close();

	}

}

