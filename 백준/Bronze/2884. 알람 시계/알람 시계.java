import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int origin_h = input.nextInt();
		int origin_m = input.nextInt();
		
		if (origin_h == 0) origin_h = 24;
		
		int origin_total_m = origin_h * 60 + origin_m;
		int early_m = origin_total_m - 45;
		
		int early_h = early_m / 60;
		early_m = early_m % 60;
		
		if (early_h == 24) early_h = 0;
		
		System.out.println(early_h + " " + early_m);
		
		input.close();
	}

}
