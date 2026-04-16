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

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int [] input = new int [6];

			for (int j = 0; j < 6; j++) {
				input[j] = Integer.parseInt(st.nextToken());
			}

			int start_hour = input[0];
			int start_min = input[1];
			int start_sec = input[2];

			int end_hour = input[3];
			int end_min = input[4];
			int end_sec = input[5];

			int cnt_hour = 0;
			int cnt_min = 0;
			int cnt_sec = 0;

			while (true) {
				if (start_sec == end_sec) {
					if (start_min == end_min) {
						if (start_hour == end_hour) {
							break;
						}
						else {
							start_hour ++;
							cnt_hour ++;
						}
					}
					else {
						start_min ++;
						cnt_min ++;
						if (start_min == 60) {
							start_min = 0;
							start_hour ++;
						}
					}
				}
				else {
					start_sec ++;
					cnt_sec ++;
					if (start_sec == 60) {
						start_sec = 0;
						start_min ++;
						if (start_min == 60) {
							start_hour ++;
						}
					}

				}


			}
			bw.write(Integer.toString(cnt_hour) + " " + Integer.toString(cnt_min) + " " + Integer.toString(cnt_sec) );
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}

