import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = n + "";
        char[] str_ = str.toCharArray();
        for(int i=0; i<str_.length; i++){
            answer += Integer.parseInt(Character.toString(str_[i]));
        }

        return answer;
    }
}