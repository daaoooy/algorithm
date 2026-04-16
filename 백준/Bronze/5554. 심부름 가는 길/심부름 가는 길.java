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
		
		int homeToSchool = Integer.parseInt(br.readLine());
		int schoolToPc = Integer.parseInt(br.readLine());
		int pcToPEI = Integer.parseInt(br.readLine());
		int peiToHome = Integer.parseInt(br.readLine());
		
		int total = homeToSchool + schoolToPc + pcToPEI + peiToHome;
		
		int min = total / 60;
		int second = total % 60;
		
		bw.write(Integer.toString(min));
		bw.newLine();
		bw.write(Integer.toString(second));
		
		bw.flush();
		bw.close();

	}

}

