import java.util.Scanner;

public class Main {
	private static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		dfs(2, 1);
		dfs(3, 1);
		dfs(5, 1);
		dfs(7, 1);
		
		sc.close();
	}
	
	private static void dfs(int num, int jarisu) {
		boolean result = sosu(num);
		if(!result) {
			return;
		} else if(result && jarisu == n) {
			System.out.println(num);
		};
		
		if(jarisu < n) {
			for(int i = 1; i <= 9; i++) {
				if(i%2 == 0) continue;
				dfs(num*10+i, jarisu+1);
			}
		}
	}

	private static boolean sosu(int num) {
		for (int i = 2; i < num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
}
