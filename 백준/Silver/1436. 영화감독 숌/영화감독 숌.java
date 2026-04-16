import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int tmp = 0;
		
		while (n > 0) {
			tmp += 1;
			if (Integer.toString(tmp).contains("666")) {
				n--;
			}
		}
		
		bw.write(Integer.toString(tmp));
		bw.flush();
		bw.close();
		br.close();
	}
}
