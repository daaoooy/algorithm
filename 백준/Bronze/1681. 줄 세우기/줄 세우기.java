import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);  
        String l = input[1];  // 포함하면 안 되는 숫자

        int result = 0;
        int tmp = 1;

        while (n > 0) {  
            if (!Integer.toString(tmp).contains(l)) { 
                result = tmp;
                n--;  
            }
            tmp++;  
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
