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

		for (int i = n; i >= 1; i--) {
			for (int j = n-1; j >= i; j--) bw.write(" ");
			for (int j = 2*i-1; j > 0; j--) bw.write("*");	
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

