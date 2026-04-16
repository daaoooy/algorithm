import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int [] triangle = new int [3];
		
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = Integer.parseInt(br.readLine());
		}
		
		if (triangle[0] + triangle[1] + triangle[2] == 180) {
			HashSet<Integer> set = new HashSet<>();
			for (int i : triangle) {
				set.add(i);
			}
			
			if (set.size() == 1) bw.write("Equilateral");
			else if (set.size() == 2) bw.write("Isosceles");
			else if (set.size() == 3) bw.write("Scalene");
		}
		else {
			bw.write("Error");
		}

		bw.flush();
		bw.close();

	}

}

