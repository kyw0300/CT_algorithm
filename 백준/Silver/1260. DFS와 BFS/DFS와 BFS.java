import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static ArrayList<Integer>[] D;
	private static ArrayList<Integer>[] B;
	private static boolean[] visited;
	
	private static Queue<Integer> queue;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		D = new ArrayList[N+1];
		B = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for (int i = 1; i < N+1; i++) {
			D[i] = new ArrayList<>();
			B[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			D[s].add(e);
			D[e].add(s);
			
			B[s].add(e);
			B[e].add(s);
		}
		
		for (int i = 1; i < N+1; i++) {
			Collections.sort(D[i]);
			Collections.sort(B[i]);
		}
		
		dfs(V);
		visited = new boolean[N+1];
		System.out.println();
		
		queue = new LinkedList<>();
		bfs(V);
	}

	private static void bfs(int v) {
		queue.add(v);
		
		visited[v] = true;
		
		while (!queue.isEmpty()) {
			int num = queue.poll();
			System.out.print(num + " ");
			
			for(int i : B[num]){
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

	private static void dfs(int v) {
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		
		System.out.print(v + " ");
		for (int i : D[v]) {
			dfs(i);
		}
	}
}
