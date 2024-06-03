import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Deque<Node> deq = new ArrayDeque<>();
		
		for (int i = 0; i < N; i++) {
			int num = arr[i];
			while (!deq.isEmpty() && deq.getLast().value > num) {
				deq.removeLast();
			}
			
			deq.addLast(new Node(i, num));
			if(deq.getFirst().index < i - L + 1) {
				deq.removeFirst();
			}
			
			bw.write(deq.getFirst().value + " ");
		}
		
		bw.flush();
		bw.close();
		
	}
	
	static class Node {
		private int index;
		private int value;
		
		Node(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
}
