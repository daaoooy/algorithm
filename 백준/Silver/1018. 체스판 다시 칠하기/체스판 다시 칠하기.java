import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String [][] chessBoard = new String [n][m];

		for (int i = 0; i < n; i++) {
			chessBoard[i] = (br.readLine()).split(""); 
		}
		
		int min = Integer.MAX_VALUE;
		
        for (int start_w = 0; start_w <= n - 8; start_w++) {
            for (int start_h = 0; start_h <= m - 8; start_h++) {
                int WB = 0;
                int BW = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((i + j) % 2 == 0) { 
                            if (!chessBoard[start_w + i][start_h + j].equals("W")) WB ++;
                            if (!chessBoard[start_w + i][start_h + j].equals("B")) BW++;
                        } else { 
                            if (!chessBoard[start_w + i][start_h + j].equals("B")) WB++;
                            if (!chessBoard[start_w + i][start_h + j].equals("W")) BW++;
                        }
                    }
                }

                min = Math.min(min, Math.min(WB, BW));
            }
        }	
        
        bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
		br.close();

	}
}

