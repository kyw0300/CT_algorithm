import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[N];
		int count = 0;
		
		long sum = 0;
		int start = 0;
		int end = N-1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			long num = arr[i];
			
			start = 0;
			end = N-1;
			
			while (start<end) {
				sum = arr[start] + arr[end];
				
				if(num > sum){
					start++;
				} else if(num < sum) {
					end--;
				} else {
					if(start != i && end != i) {
						count++;
						break;
					} else if(start == i) {
						start++;
					} else if(end == i) {
						end--;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}