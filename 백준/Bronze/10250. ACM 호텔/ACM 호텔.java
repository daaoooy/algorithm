import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int case_num = input.nextInt();
		
		for (int i = 0; i < case_num; i++) {
			int H = input.nextInt();
			int W = input.nextInt();
			int N = input.nextInt();
			
			int result_h = 0;
			int result_w = 0;
			
			for (int j = 0; j < N; j++) { 
				if (j % H == 0) {
					result_h = 1;
					result_w ++;
				}
				
				else {
					result_h ++;
				}
			}
			if (result_w > 9) System.out.println(result_h + "" + result_w);
			else System.out.println(result_h + "0" + result_w);

		}
				
		input.close(); 
	}

}
