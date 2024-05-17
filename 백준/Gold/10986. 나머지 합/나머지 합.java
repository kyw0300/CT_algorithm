import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);	// Scanner? StringTokenizer?
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		
		S[0] = sc.nextInt();				// S[0] 시작을 이런식으로도 가능
		for (int i = 1; i < N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}

		for (int i = 0; i < N; i++) {	// N == S.length
			int remainder = (int) (S[i] % M);
			if(remainder == 0) answer++;
			C[remainder]++;
		}
		for (int i = 0; i < M; i++) {
			if(C[i] > 1) {
				answer += C[i] * (C[i]-1) / 2;
			}
		}
		
		System.out.println(answer);
	}
}