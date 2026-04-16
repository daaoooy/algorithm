import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total_price = 0;
		
		int sangduck = Integer.parseInt(br.readLine());
		int jungduck = Integer.parseInt(br.readLine());
		int haduck = Integer.parseInt(br.readLine());
		
		int coke = Integer.parseInt(br.readLine());
		int soda = Integer.parseInt(br.readLine());
		
		if (Math.min(sangduck, jungduck) > haduck) total_price += haduck;
		else total_price += Math.min(sangduck, jungduck);
		
		if (coke > soda) total_price += soda;
		else total_price += coke;
		
		bw.write(Integer.toString(total_price-50));
		
		bw.flush();
		bw.close();

	}

}

