class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();

        for(int i=0; i<charArr.length; i++){
            answer += Character.toString(charArr[charArr.length - i - 1]);
        }
        
        return answer;
    }
}