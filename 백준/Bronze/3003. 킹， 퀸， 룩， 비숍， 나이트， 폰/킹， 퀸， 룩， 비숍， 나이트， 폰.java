import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int K = 1;
		int Q = 1;
		int L = 2;
		int B = 2;
		int N = 2;
		int P = 8;

		int[] arr = {K, Q, L, B, N, P};

		String ip = input.nextLine();
		String[] ipArr = ip.split(" ");

		int[] resultArr = new int[ipArr.length];

		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(ipArr[i]) == arr[i]) {
				resultArr[i] = 0;
			}
			else {
				resultArr[i] = arr[i] - Integer.parseInt(ipArr[i]);
			}
		}

		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
        input.close();
	}

}