import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = br.readLine();

		while (!n.equals("0")) {
			bw.write(n + " ");
			while (n.length() >= 2) {
				String [] split_str = n.split("");
				int [] split_int = new int [split_str.length];

				for (int i = 0; i < split_str.length; i++) {
					split_int[i] = Integer.parseInt(split_str[i]);
				}
				
				int mul = 1;
				for (int i = 0; i < split_int.length; i++) {
					mul *= split_int[i];
				}
				
				n = Integer.toString(mul);
				bw.write(n + " ");
			}		
			bw.newLine();
			n = br.readLine();
		}
		bw.flush();
		bw.close();

	}

}

