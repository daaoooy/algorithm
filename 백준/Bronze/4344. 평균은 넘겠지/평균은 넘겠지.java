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

		int case_num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < case_num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int student_num = Integer.parseInt(st.nextToken());
			int [] student_score = new int [student_num];
			
			for (int j = 0; j < student_num; j++) 
				student_score[j] = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			double average = 0;
			
			for (int j = 0; j < student_num; j++) 
				sum += student_score[j];
			
			average = sum / student_num;
			
			double high_student = 0;
			
			for (int j = 0; j < student_num; j++) {
				if (student_score[j] > average) high_student ++;
			}
			
			double percent = (high_student / student_num) * 100;
			
			bw.write(Double.toString(percent) + "%");
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();

	}

}

