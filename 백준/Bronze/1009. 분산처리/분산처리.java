import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testNum = input.nextInt();
		int [] resultArr = new int[testNum];
		int count = 0;
		input.nextLine();
		
		while(testNum != 0) {		
			testNum --;
			
			String [] ab = (input.nextLine()).split(" ");
			
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			
			int result = a % 10;
			
			for (int i = 1; i < b; i++)
				result = (result * a) % 10;			
			
			if (result == 0) 
				result = 10;
			
			resultArr[count++] = result;
		}
		
		for (int i = 0; i < resultArr.length-1; i++) 
			System.out.println(resultArr[i]);
		
		System.out.print(resultArr[resultArr.length-1]);
        
        input.close();
	}

}