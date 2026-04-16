import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int find = 0;
		int tmp = 1;
		
		while (find == 0) {
			String [] str = (Integer.toString(tmp)).split("");
			int sum = tmp;
			
			if (n < tmp) {
				find = 0;
				break;
			}
			
			for (int i = 0; i < str.length; i++) {
				sum += Integer.parseInt(str[i]);
			}
			
			if (sum == n) {
				find = 1;
			} else {
				tmp ++;
			}
		}
		
		if (find == 0) {
			bw.write("0");
		} else if (find == 1) {
			bw.write(Integer.toString(tmp));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
