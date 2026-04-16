
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double[] origin_score = new double[n];
		double [] change_score = new double[n];

		for (int i = 0; i < n; i++) 
			origin_score[i] = input.nextInt();
		
		double max = origin_score[0];
		
		for (int i = 1; i < n; i++) 
			if (max < origin_score[i]) max = origin_score[i];
		
		for (int i = 0; i < n; i++) 
			change_score[i] = ((origin_score[i] / max) * 100);
		
		double s = 0;
		
		for (int i = 0; i < n; i++) s += change_score[i];
		
		System.out.println(s/n);
		
		input.close();
	}

}
