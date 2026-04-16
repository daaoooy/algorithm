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
		
		String str_a = st.nextToken();
		String str_b = st.nextToken();
		String str_c = st.nextToken();
		String str_d = st.nextToken();
		
		String ab = str_a + str_b;
		String cd = str_c + str_d;
		
		long int_ab = Long.parseLong(ab);
		long int_cd = Long.parseLong(cd);
		
		bw.write(Long.toString(int_ab+int_cd));
		bw.flush();
		bw.close();

	}

}

