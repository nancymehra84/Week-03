package insertion_sort;
import java.util.Arrays;
public class SortEmployeeIds {
    public static void insertionSort(int[] employee){
        for(int i=1;i<employee.length;i++){
            int current=employee[i];
            int j=i-1;
            while(j>=0 && current<employee[j]){
                employee[j+1]=employee[j];
                j--;
            }
            employee[j+1]=current;
        }
    }
    public static void main(String[] args){
        int[] employee={1102,1100,1002,1005,1001};
        insertionSort(employee);
        System.out.println(Arrays.toString(employee));
    }
}
