package selection_sorting;

import java.util.Arrays;
public class SortExamScore {
    public static void selectionSort(int[] score){
        for(int i=0;i<score.length;i++){
            int smallest=i;
            for (int j=i+1;j<score.length;j++){
                if(score[smallest]>score[j]){
                    smallest=j;
                }
            }
            int temp=score[smallest];
            score[smallest]=score[i];
            score[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] score={89,98,76,95,82};
        selectionSort(score);
        System.out.println(Arrays.toString(score));
    }
}
