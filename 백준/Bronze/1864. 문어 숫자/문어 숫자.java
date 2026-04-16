import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] list = {"-", "\\", "(", "@", "?", ">", "&", "%", "/"};

		String str = br.readLine();		

		while (!str.equals("#")) {
			String [] line = str.split("");
			int [] result = new int [line.length];

			for (int i = 0; i < line.length; i++) 
				for (int j = 0; j < list.length; j++) 
					if (line[i].equals(list[j])) {
						if (j == 8) result[i] = -1;
						else result[i] = j;						
						break;
					}

			int c = result.length-1;
			int ans = 0;

			for (int i = 0; i < result.length; i++) {
				ans += result[i] * Math.pow(8, c);
				c--;
			}

			bw.write(Integer.toString(ans));
			bw.newLine();

			str = br.readLine();
		}


		bw.flush();
		bw.close();

	}

}

