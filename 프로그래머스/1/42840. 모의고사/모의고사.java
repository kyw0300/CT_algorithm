import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,1,2,3,2,4,2,5};
		int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		
		for (int i = 0; i < answers.length; i++) {
			int index1 = i%5;
			int index2 = i%8;
			int index3 = i%10;
			
			if(answers[i] == arr1[index1]) {
				result1++;
			}
			if(answers[i] == arr2[index2]) {
				result2++;
			}
			if(answers[i] == arr3[index3]) {
				result3++;
			}
		}
		
		int[] result = {result1, result2, result3};
		int max = 0;
		for (int i = 0; i < result.length; i++) {
			if(max < result[i]) {
				max = result[i];
			}
		}
		
		int length = 0;
		
		for (int i = 0; i < result.length; i++) {
			if(result[i] == max) {
				length++;
			}
		}
		
		List<Integer> arr = new ArrayList<Integer>();
		
		if(result[0] == max) arr.add(1);
		if(result[1] == max) arr.add(2);
		if(result[2] == max) arr.add(3);
		
		int[] answer = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
        
        return answer;
    }
}