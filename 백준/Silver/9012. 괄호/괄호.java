import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());


		for (int i = 0; i < n; i++) {
			int check = 0;
			String str = br.readLine();
			Stack<String> stack = new Stack<>();
			
			for (int j = 0; j < str.length(); j++) {
				// "("
				if (str.charAt(j) == '(') {
					stack.add("0");
				}

				// ")"
				else {
					if (stack.size() == 0) {
						check = 1;
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			
			if (check == 1) {
				bw.write("NO\n");
				bw.flush();
			}
			else {
				if (stack.size() != 0) {
					bw.write("NO\n");
					bw.flush();
				} else {
					bw.write("YES\n");
					bw.flush();
				}
			}
			
		}

		bw.close();
		br.close();
	}

}

