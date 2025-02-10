package runtime_analysis.comparing_data_structure;
import java.util.Arrays;
import java.util.Random;

public class LinearSearchVsBinarySearch {
    //main method
    public static void main(String[] args){
        //size of dataset
        int[] sizes={1000,10000,1000000};
        Random random=new Random();

        for(int num:sizes){
            int[] data=new int[num];

            //filling array with random numbers
            for(int i=0;i<num;i++){
                data[i]= random.nextInt(num);
            }
            //random number
            int target=data[random.nextInt(num)];

            //linear search time
            long startTime=System.nanoTime();
            LinearSearch(data,target);
            long LinearTime=System.nanoTime()-startTime;

            //Sorting Array for Binary Search
            Arrays.sort(data);

            //Binary Search Time
            startTime=System.nanoTime();
            BinarySearch(data,target);
            long BinaryTime=System.nanoTime()-startTime;

            //Output the result
            System.out.println("Dataet Size:"+num+", Linear Search:"+LinearTime+", Binary Search:"+BinaryTime);
        }
    }

    //method for Linear Search
    public static int LinearSearch(int [] arr, int target){
        int index =0;
        for(int num:arr){
            if(num==target) return index;
            index++;
        }
        return -1;
    }

    //method for Binary Search
    public static int BinarySearch(int[] arr, int target){
        int left=0,right= arr.length-1;
        while(left<right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid]<target)left=mid +1;
            else right=mid-1;
        }
        return -1;
    }
}
