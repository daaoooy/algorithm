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
		
		int present_hour = Integer.parseInt(st.nextToken());
		int present_min = Integer.parseInt(st.nextToken());
		int present_sec = Integer.parseInt(st.nextToken());
		
		int time = Integer.parseInt(br.readLine());
		
		int result_hour = present_hour + (time / 3600);
		int result_min = (present_min + ((time % 3600) / 60));
		int result_sec = present_sec + ((time % 3600) % 60);
		
		while (result_sec >= 60) {
			result_sec -= 60;
			result_min += 1;
		}
		
		while (result_min >= 60) { 
			result_min -= 60;
			result_hour += 1;
		}
	
		
		while (result_hour >= 24) {
			result_hour -= 24;
		}
		
		bw.write(Integer.toString(result_hour) + " " + Integer.toString(result_min) + " " + Integer.toString(result_sec));
		
		bw.flush();
		bw.close();

	}

}

