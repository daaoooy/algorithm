import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList <Integer> list = new ArrayList <>();

		for (int i = 0; i < 9; i++) 
			list.add(Integer.parseInt(br.readLine()));
		Collections.sort(list);

		int a = -1;
		int b = -1;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				int sum = 0;
				for (int k = 0; k < list.size(); k++) {
					if (k != i && k != j) {
						sum += list.get(k);
					}
				}
				if (sum == 100) {
					a = i;
					b = j;
					break;
				}
				else {
					a = -1;
					b = -1;
				}
			}
			if (a != -1 && b != -1) break;
		}

		for (int i = 0; i < list.size(); i++) {
			if (i != a && i != b) {
				bw.write(Integer.toString(list.get(i)));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

	}

}

