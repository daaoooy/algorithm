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
		
		double c_width = Double.parseDouble(br.readLine());
		double a_radius = Double.parseDouble(br.readLine());
		
		double korner = 2 * (3.141592) * a_radius;
		
		double result = (2 * c_width) + korner;
		
		bw.write(Double.toString(result));
		
		bw.flush();
		bw.close();

	}

}

