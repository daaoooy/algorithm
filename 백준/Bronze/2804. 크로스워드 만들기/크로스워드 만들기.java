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

		StringTokenizer st = new StringTokenizer(br.readLine());

		String [] A = (st.nextToken()).split("");
		String [] B = (st.nextToken()).split("");

		int same_A = 0;
		int same_B = 0;
		int t = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i].equals(B[j])) {
					same_A = i;
					same_B = j;
					t = 1;
					break;
				}
			}

			if (t == 1) {
				break;
			}

		}

		// bw.write(Integer.toString(same_A) + " " + Integer.toString(same_B));

		for (int i = 0; i < B.length; i++) {
			if (i == same_B) {
				for (int j = 0; j < A.length; j++) {
					bw.write(A[j]);
				}
				bw.write("\n");
			}
			else {
				for (int j = 0; j < A.length; j++) {
					if (j == same_A) {
						bw.write(B[i]);
					} 
					else {
						bw.write(".");
					}
				}
				bw.write("\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();

	}

}

