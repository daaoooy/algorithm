import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine()); // 국어 숙제 양
		int B = Integer.parseInt(br.readLine()); // 수학 숙제 양
		int C = Integer.parseInt(br.readLine()); // 국어 하루에 풀 수 있는 양
		int D = Integer.parseInt(br.readLine()); // 수학 하루에 풀 수 있는 양
		
		int take_korean, take_math;
		
		if (A % C != 0) take_korean = (A / C) + 1;
		else take_korean = A / C;
		
		if (B % D != 0) take_math = (B / D) + 1;
		else take_math = B / D;
		
		if (take_korean > take_math) {
			bw.write(Integer.toString(L - take_korean));
		}
		else {
			bw.write(Integer.toString(L - take_math));
		}

		bw.flush();
		bw.close();

	}

}

