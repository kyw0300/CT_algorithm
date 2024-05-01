class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        
        for(int i=0; i<strArr.length; i++){
            switch (strArr[i]) {
			case "1":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "2":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "3":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "4":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "5":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "6":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "7":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "8":
				answer += Integer.parseInt(strArr[i]);
				break;
			case "9":
				answer += Integer.parseInt(strArr[i]);
				break;
			default:
				break;
			}
        }
        
        return answer;
    }
}