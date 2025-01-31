package bubble_sort;
import java.util.Arrays;

public class SortStudentMarks {
    public static void bubblesort(int [] marks){
        boolean Swapped;
        for(int i=0;i<marks.length-1;i++){
            Swapped =false;

            for(int j=0;j<marks.length-1;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    Swapped =true;
                }
            }
            if(!Swapped)break;
        }
    }
    public static void main(String[] args){
        int[] marks={89,75,67,91,85,78};
        bubblesort(marks);
        System.out.println(Arrays.toString(marks));
    }
}
