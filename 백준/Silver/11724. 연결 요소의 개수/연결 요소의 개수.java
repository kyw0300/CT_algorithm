import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static ArrayList<Integer>[] A;
	private static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for (int i = 1; i < A.length; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			A[start].add(end);
			A[end].add(start);
		}
		
		int count = 0;
		
		for (int i = 1; i < visited.length; i++) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
		
		System.out.println(count);
	}

	private static void dfs(int i) {
		if(visited[i]) {
			return;
		}
		
		visited[i] = true;
		
		for (int j = 0; j < A[i].size(); j++) {
			if(!visited[A[i].get(j)]) {
				dfs(A[i].get(j));
			}
		}
	}
}
