import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charArray = br.readLine().toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			int max_index = i;
			for (int j = i; j < charArray.length; j++) {
				if(charArray[max_index] < charArray[j]) max_index = j;
			}
			
			char temp = charArray[i];
			charArray[i] = charArray[max_index];
			charArray[max_index] = temp;
		}
		
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}
}
