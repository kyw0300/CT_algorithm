class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
		Double[] failArr = new Double[N];
		
		int mem = stages.length;
		
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			for (int j = 0; j < stages.length; j++) {
				if((i+1) == stages[j]) {
					cnt++;
				}
			}
			
			answer[i] = i+1;
			failArr[i] = ((double)cnt/mem);
			mem -= cnt;
		}
		
		for (int i = 0; i < failArr.length; i++) {
			for (int j = i+1; j < failArr.length; j++) {
				
				if(Double.compare(failArr[i], failArr[j]) == 0) {
					if(answer[i] > answer[j]) {
						Double temp = 0.0;
						temp = failArr[i];
						failArr[i] = failArr[j];
						failArr[j] = temp;
						
						int temp1 = 0;
						temp1 = answer[i];
						answer[i] = answer[j];
						answer[j] = temp1;
					}
				}
				
				if(failArr[i] < failArr[j]) {
					Double temp = 0.0;
					temp = failArr[i];
					failArr[i] = failArr[j];
					failArr[j] = temp;
					
					int temp1 = 0;
					temp1 = answer[i];
					answer[i] = answer[j];
					answer[j] = temp1;
				}
			}
		}
        
        return answer;
    }
}