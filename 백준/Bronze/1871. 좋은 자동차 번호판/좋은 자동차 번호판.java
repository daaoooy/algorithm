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
		
		for (int i = 0; i < n; i++) {
			String [] inp = (br.readLine()).split("-");
			
			int first_value = 0;
			int second_value = 0;
			
			int cnt = 2;
			for (int j = 0; j < 3; j++) {
				first_value += (((int)(inp[0].charAt(j))-65)*Math.pow(26, cnt--));
			}
			
			StringBuilder sb = new StringBuilder();
			
			if ((inp[1].charAt(0)) != '0') {
				sb.append(inp[1]);
			}
			else {
				if ((inp[1].charAt(1)) != '0') {
					sb.append(inp[1].substring(1, 4));
				}
				else {
					if ((inp[1].charAt(2)) != '0') {
						sb.append(inp[1].substring(2, 4));
					}
					else {
						if ((inp[1].charAt(3)) != '0') {
							sb.append(inp[1].charAt(3));
						}
						else {
							sb.append("0");
						}
					}
				}
			}
			
			second_value = Integer.parseInt(sb.toString());
			
			if (Math.abs(first_value-second_value) <= 100) {
				bw.write("nice");
			}
			else {
				bw.write("not nice");
			}
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

