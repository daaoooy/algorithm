import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        String word = br.readLine();
        int result = 0;
        
        int i = 0;
        
        while (i <= input.length() - word.length()) {
        	int check = 1;
        	for (int j = 0; j < word.length(); j++) {
        		if (input.charAt(i+j) != word.charAt(j)) {
        			check = 0;
        			break;
        		}
        	}
        	
        	if (check == 1) {
        		result ++;
        		i += word.length();
        	}
        	else {
        		i++;
        	}
        }
        
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
