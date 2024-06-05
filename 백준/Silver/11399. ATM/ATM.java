import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < arr.length; i++) {
			int index = i;
			while (true) {
				if(index > 0 && arr[index] < arr[index-1]) {
					int temp = arr[index];
					arr[index] = arr[index-1];
					arr[index-1] = temp;
					index--;
				} else {
					break;
				}
			}
		}
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] * (N-i);
		}
		
		System.out.println(result);
	}
}
