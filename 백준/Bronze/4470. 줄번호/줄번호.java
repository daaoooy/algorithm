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
		
		int caseNum = Integer.parseInt(br.readLine());
		String [] line = new String [caseNum];
		
		for (int i = 0; i < caseNum; i++) {
			line[i] = br.readLine();
		}
		
		for (int i = 1; i <= caseNum; i++) {
			bw.write(Integer.toString(i) + ". " + line[i-1]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

