import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [][] board = new String [8][8];
		int count = 0;
		
		for (int i = 0; i < 8; i++) {
			board[i] = (br.readLine()).split("");
		}
		
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 8; j += 2) 
					if (board[i][j].equals("F")) count ++;
			}
			else {
				for (int j = 1; j < 8; j += 2) 
					if (board[i][j].equals("F")) count ++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();

	}

}

