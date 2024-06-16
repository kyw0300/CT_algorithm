import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static ArrayList<Integer>[] A;
	private static boolean visited[];
	private static boolean result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N];
		visited = new boolean[N];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			A[start].add(end);
			A[end].add(start);
		}
		
		for (int i = 0; i < N; i++) {
			dfs(i, 1);
			
			if(result) {
				System.out.println(1);
				return;
			}
		}
		if(!result) System.out.println(0);
	}
	
	private static void dfs(int i, int depth) {
		if(depth == 5 || result) {
			result = true;
			return;
		}
		
		visited[i] = true;
		
		for (int j = 0; j < A[i].size(); j++) {
			if(!visited[A[i].get(j)]) {
				dfs(A[i].get(j), depth+1);
			}
		}
		
		visited[i] = false;
	}
}
