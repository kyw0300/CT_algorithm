import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        String[] dirsArr = dirs.split("");
		Set<String> set = new HashSet<String>();
		
		int x = 0;
		int y = 0;
		
		if(dirsArr.length > 0) {
			for (int i = 0; i < dirsArr.length; i++) {
				String start = "";
				String end = "";
				
				switch (dirsArr[i]) {
				case "U":
					if(y+1 <= 5) {
						start = "(" + x + "," + y + ")";
						y++;
						end = "(" + x + "," + y + ")";
						
						set.add(start+end);
						set.add(end+start);
					}
					break;
				case "D":
					if(y-1 >= -5) {
						start = "(" + x + "," + y + ")";
						y--;
						end = "(" + x + "," + y + ")";

						set.add(start+end);
						set.add(end+start);
					}
					break;
				case "L":
					if(x-1 >= -5) {
						start = "(" + x + "," + y + ")";
						x--;
						end = "(" + x + "," + y + ")";

						set.add(start+end);
						set.add(end+start);
					}
					break;
				case "R":
					if(x+1 <= 5) {
						start = "(" + x + "," + y + ")";
						x++;
						end = "(" + x + "," + y + ")";

						set.add(start+end);
						set.add(end+start);
					}
					break;
				}
			}
		}
		
		answer = set.size()/2;
        
        return answer;
    }
}