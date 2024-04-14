class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(babbling[i].contains(arr[j])){
					babbling[i] = babbling[i].replace(arr[j], "_");
				}
			}
		}
        
        for (int i = 0; i < babbling.length; i++) {
			if(babbling[i].equals("_") || babbling[i].equals("__") || 
               babbling[i].equals("___") || babbling[i].equals("____")) {
				answer++;
			}
		}
        
        return answer;
    }
}