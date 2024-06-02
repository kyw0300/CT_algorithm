import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		char[] dnaArr = br.readLine().toCharArray();

		int[] checkArr = new int[4];
		int[] myArr = new int[4];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < checkArr.length; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		int start = 0;
		int end = P - 1;

		for (int i = start; i < P; i++) {
			switch (dnaArr[i]) {
			case 'A':
				myArr[0]++;
				break;
			case 'C':
				myArr[1]++;
				break;
			case 'G':
				myArr[2]++;
				break;
			case 'T':
				myArr[3]++;
				break;
			}
		}
        
        if (checkArr[0] <= myArr[0] && checkArr[1] <= myArr[1] && checkArr[2] <= myArr[2] && checkArr[3] <= myArr[3]) {
			count++;
		}
		start++;
		end++;

		while (end < S) {
			switch (dnaArr[start - 1]) {
			case 'A':
				myArr[0]--;
				break;
			case 'C':
				myArr[1]--;
				break;
			case 'G':
				myArr[2]--;
				break;
			case 'T':
				myArr[3]--;
				break;
			}

			switch (dnaArr[end]) {
			case 'A':
				myArr[0]++;
				break;
			case 'C':
				myArr[1]++;
				break;
			case 'G':
				myArr[2]++;
				break;
			case 'T':
				myArr[3]++;
				break;
			}

			if (checkArr[0] <= myArr[0] && checkArr[1] <= myArr[1] && checkArr[2] <= myArr[2]
					&& checkArr[3] <= myArr[3]) {
				count++;
			}

			start++;
			end++;
		}

		System.out.println(count);
	}
}
