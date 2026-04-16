import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int row = 0;
        int col = Integer.parseInt(br.readLine());
        
        String e = br.readLine();
        List<String> split_e = new ArrayList<>();
       
        for (int i = 0; i < e.length(); i+= col) {
        	int end = Math.min(i+col, e.length()); 
        	
        	if (row % 2 == 0) {
        		split_e.add(e.substring(i, end));
        	} else {
        		StringBuilder sb = new StringBuilder(e.substring(i, end));
        		split_e.add(sb.reverse().toString());
        	}
        	row ++;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < col; i++) {
        	for (int j = 0; j < row ; j++) {
        		result.append((split_e.get(j)).charAt(i));
        	}
        }
        
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
       
    }
}
