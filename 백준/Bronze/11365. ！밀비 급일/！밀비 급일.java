import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList <String> list = new ArrayList<>();
		
		String str = "";
		str = br.readLine();
		
		while (!str.equals("END")) {
			list.add(str);
			str = br.readLine();
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = (list.get(i)).length()-1; j >= 0; j--) {
				bw.write((list.get(i)).charAt(j)); 
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

