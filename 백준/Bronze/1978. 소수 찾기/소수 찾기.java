import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		String [] tmp = (br.readLine()).split(" ");
		int [] arr = new int [tmp.length];
		
		for (int i = 0; i < tmp.length; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}
		
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int is_prime = 1;
			
			if (arr[i] == 2) {
				is_prime = 1;
			} 
			else if (arr[i] < 2) {
				is_prime = 0;
			}	
			else if (arr[i] > 2) {
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						is_prime = 0;
						break;
					}
				}
			}
			
			if (is_prime == 1) {
				result += 1;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		
		bw.close();
		br.close();
		
	}

}

