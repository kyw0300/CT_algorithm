import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N+1][N+1];
		int[][] sumArr = new int[N+1][N+1];
		
		for (int i = 1; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				sumArr[i][j] = sumArr[i][j-1] + arr[i][j] + sumArr[i-1][j] - sumArr[i-1][j-1];
			}
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int sum = sumArr[z][k] - sumArr[x-1][k] - sumArr[z][y-1] + sumArr[x-1][y-1];
			System.out.println(sum);
		}
    }
}