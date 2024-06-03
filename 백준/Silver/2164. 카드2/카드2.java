import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while (queue.size() != 1) {
			queue.remove();
			queue.add(queue.remove());
		}
		
		System.out.println(queue.peek());
		sc.close();
	}
}
