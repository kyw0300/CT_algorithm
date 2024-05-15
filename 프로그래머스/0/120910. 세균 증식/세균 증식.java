class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        int cnt = 0;
        while(cnt < t){
            answer *= 2;
            cnt++;
        }
        answer *= n;
        
        return answer;
    }
}