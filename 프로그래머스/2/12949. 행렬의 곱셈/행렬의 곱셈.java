import java.util.LinkedList;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] resultArr = new int[arr1.length][arr2[0].length];
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				
				for(int i1=0; i1<arr1[i].length; i1++) {
					a.add(arr1[i][i1]);
				}
				
				for (int k = 0; k < arr2.length; k++) {
					b.add(arr2[k][j]);
				}
				
				for (int k = 0; k < a.size(); k++) {
					resultArr[i][j] += a.get(k) * b.get(k);
				}
				
				a.clear();
				b.clear();
			}
		}
        
        return resultArr;
    }
}