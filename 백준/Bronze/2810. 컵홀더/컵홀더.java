import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String seats = br.readLine();
		
		int cup_holders = 1;
		
		for (int i = 0; i < n; i++) {
			if (seats.charAt(i) == 'S') {
				cup_holders ++;
			} else if (seats.charAt(i) == 'L') {
				cup_holders ++;
				i++;
			}
		}
		
		int result = Math.min(n, cup_holders);
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
