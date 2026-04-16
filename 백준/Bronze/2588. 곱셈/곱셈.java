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
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int first_line = a * (b % 10);
		int second_line = a * ((b % 100) / 10);
		int third_line = a* (b / 100);
		int result = a * b;
		
		bw.write(Integer.toString(first_line));
		bw.newLine();
		bw.write(Integer.toString(second_line));
		bw.newLine();
		bw.write(Integer.toString(third_line));
		bw.newLine();
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
		
	}

}

