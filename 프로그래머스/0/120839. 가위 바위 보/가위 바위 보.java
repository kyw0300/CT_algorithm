class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspArr = rsp.split("");
        
        for(int i=0; i<rspArr.length; i++){
            if(rspArr[i].equals("2")){
                answer += "0";
            }else if(rspArr[i].equals("0")){
                answer += "5";
            }else{
                answer += "2";
            }
        }
        
        return answer;
    }
}