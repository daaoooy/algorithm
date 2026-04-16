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
		
		String score = br.readLine();
		
		if (score.equals("A+")) bw.write("4.3");
		else if (score.equals("A0")) bw.write("4.0");
		else if (score.equals("A-")) bw.write("3.7");
		else if (score.equals("B+")) bw.write("3.3");
		else if (score.equals("B0")) bw.write("3.0");
		else if (score.equals("B-")) bw.write("2.7");
		else if (score.equals("C+")) bw.write("2.3");
		else if (score.equals("C0")) bw.write("2.0");
		else if (score.equals("C-")) bw.write("1.7");
		else if (score.equals("D+")) bw.write("1.3");
		else if (score.equals("D0")) bw.write("1.0");
		else if (score.equals("D-")) bw.write("0.7");
		else bw.write("0.0");
				
		bw.flush();
		bw.close();
		
	}

}

