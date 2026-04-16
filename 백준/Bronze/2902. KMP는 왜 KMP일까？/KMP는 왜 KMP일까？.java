import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		
		String [] list = input.split("-");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < list.length; i++) {
			sb = sb.append(list[i].charAt(0));
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();

	}

}

