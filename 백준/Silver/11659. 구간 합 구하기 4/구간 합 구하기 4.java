import java.util.Scanner;

class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] nArr = new int[N+1];
        int[] sArr = new int[N+1];
        
        for(int i=1; i<nArr.length; i++){
            nArr[i] = sc.nextInt();
            sArr[i] = sArr[i-1] + nArr[i];
        }
        
        int[] answer = new int[M];
        
        for(int k=0; k<M; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            answer[k] = sArr[j]-sArr[i-1];
        }
        
        for(int k=0; k<M; k++){
            System.out.println(answer[k]);
        }
    }
}