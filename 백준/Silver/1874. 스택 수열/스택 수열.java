import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		int cnt = 1;
		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			
			while (num > stack.peek()) {
				stack.push(cnt);
				sb.append("+\n");
				cnt++;
			}
			
			if(stack.peek() == num) {
				stack.pop();
				sb.append("-\n");
			} else {
				sb = new StringBuffer();
				sb.append("NO");
				break;
			}
		}
		
		System.out.println(sb.toString());
	}
}