import java.lang.Character;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] strArr = my_string.toCharArray();
		
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i] >= 97) {
				strArr[i] -= 32;
			}else {
				strArr[i] += 32;
			}
			answer += Character.toString(strArr[i]);
		}
        
        return answer;
    }
}