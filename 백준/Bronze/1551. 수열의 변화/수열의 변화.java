import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		String [] tmp = (br.readLine()).split(",");
		ArrayList <Integer> A = new ArrayList <>();
		ArrayList <Integer> B = new ArrayList <>();

		for (int i = 0; i < tmp.length; i++) 
			A.add(Integer.parseInt(tmp[i]));

		while (k > 0) {
			for (int i = 0; i < A.size()-1; i++) 
				B.add(A.get(i+1)-A.get(i));

			A.clear();
			for (int i = 0; i < B.size(); i++) 
				A.add(B.get(i));

			B.clear();
			k--;
		}

		for (int i = 0; i < A.size()-1; i++) 
			bw.write(Integer.toString(A.get(i)) + ",");		

		bw.write(Integer.toString(A.get(A.size()-1)));
		bw.flush();
		bw.close();

	}

}

