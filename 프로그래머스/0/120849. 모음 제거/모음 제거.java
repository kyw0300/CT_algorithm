class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        for(int i=0; i<strArr.length; i++){
            switch(strArr[i]){
                case "a":
                    break;
                case "e":
                    break;
                case "i":
                    break;
                case "o":
                    break;
                case "u":
                    break;
                default:
                    answer += strArr[i];
            }
        }
        return answer;
    }
}