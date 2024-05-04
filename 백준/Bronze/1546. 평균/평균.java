import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scoreArr = new int[N];
        double[] newScoreArr = new double[N];
        
        for(int i=0; i<scoreArr.length; i++){
            scoreArr[i] = sc.nextInt();
        }
        
        double newAvg = 0.0;
        int max = 0;
        for(int i=0; i<scoreArr.length; i++){
            if(max < scoreArr[i]) max = scoreArr[i];
        }
        
        for(int i=0; i<scoreArr.length; i++){
            newScoreArr[i] = ((double) scoreArr[i])/max * 100;
        }
        
        double sum = 0.0;
        for(int i=0; i<newScoreArr.length; i++){
            sum += newScoreArr[i];
        }
        
        newAvg = sum/N;
        System.out.println(newAvg);
    }
}