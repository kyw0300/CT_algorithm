import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		int sum = 1;
		int start = 1;
		int end = 1;
		int count = 1;
		
		while (end != arr.length) {
			if(sum < N) {
				end++;
				sum += end;
			} else if(sum > N) {
				sum -= start;
				start++;
			} else {
				count++;
				end++;
				sum += end;
			}
		}
		
		System.out.println(count);
	}
}