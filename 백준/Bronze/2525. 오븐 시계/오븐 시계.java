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
		int start_hour = Integer.parseInt(st.nextToken());
		int start_min = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		int finish_hour = start_hour + (time / 60);
		int finish_min = start_min + (time % 60);
		
		if (finish_min >= 60) {
			finish_hour += (finish_min / 60);
			finish_min = finish_min % 60;
		}
		
		while (finish_hour >= 24) {
			finish_hour -= 24;
		}
		
		bw.write(Integer.toString(finish_hour) + " " + Integer.toString(finish_min));
		bw.flush();
		bw.close();
		
	}

}

