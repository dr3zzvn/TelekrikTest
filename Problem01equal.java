import java.util.Scanner;

public class Problem01equal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int num = input.nextInt();
			arr[i] = num;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
