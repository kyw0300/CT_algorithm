import java.lang.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        answer = array[(array.length-1)/2];
        return answer;
    }
}