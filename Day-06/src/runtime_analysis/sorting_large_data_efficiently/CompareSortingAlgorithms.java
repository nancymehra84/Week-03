package runtime_analysis.sorting_large_data_efficiently;
import java.util.Arrays;
import java.util.Random;

public class CompareSortingAlgorithms {
    //main method
    public static void main(String[] args){
        //given dataset sizes
        int[] sizes={1000,100000,1000000};
        Random random =new Random();

        for(int n=0;n<sizes.length-1;n++){
            int[] data=new int[n];

            //filling array with random number
            for(int i = 0; i<n; i++){
                data[i]=random.nextInt(n);
            }

            //Measure bubble sort time
            long BubbleTime=-1;

                int[] bubbleData = Arrays.copyOf(data, data.length);
                long startTime = System.nanoTime();
                BubbleSort(bubbleData);
                BubbleTime = System.nanoTime() - startTime;


            //measure merge sort time
            int[] mergeData=Arrays.copyOf(data,data.length);
            startTime=System.nanoTime();
            MergeSort(mergeData,0, mergeData.length-1);
            long mergeTime=System.nanoTime()-startTime;

            //measure quick sort time
            int[] quickData=Arrays.copyOf(data,data.length);
            startTime=System.nanoTime();
            QuickSort(quickData,0, quickData.length-1);
            long quickTime=System.nanoTime()-startTime;

            System.out.println("Dataset Sizes:"+ n);
            if(BubbleTime!=-1) {
                System.out.println("Bubble sort :" + BubbleTime /(float) 1000000 + " ms");
            }
            else{
                System.out.println("Error");
            }
            System.out.println("Merge Sort:"+ mergeTime/(float)1000000+" ms");
            System.out.println("Quick Sort:"+quickTime/(float)1000000+"ms");
            System.out.println();
        }

    }
    //method for bubble sort(O(N^2))
    public static void BubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }

    //method for merge sort(O(NlogN))
    public static void MergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            MergeSort(arr,left,mid);
            MergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int[] merged=new int[right-left+1];
        int n1=left;
        int n2=mid+1;
        int x=0;

        while(n1<=mid && n2<=right) {
            if (arr[n1] < arr[n2]) {
                merged[x] = arr[n1];
                x++;
                n1++;
            } else {
                merged[x] = arr[n2];
                x++;
                n2++;
            }
        }
        while(n1<=mid){
            merged[x] = arr[n1];
            x++;
            n1++;
        }
        while(n2<=right){
            merged[x] = arr[n2];
            x++;
            n2++;
        }
    }

    //Method for quick sortsort(O(NlogN))
    public static void QuickSort(int[] arr,int low, int high){
        if(low<high){
            int pivot_index=Partition(arr, low, high);
            QuickSort(arr, low, pivot_index-1);
            QuickSort(arr,pivot_index+1,high);
        }
    }
    public static int Partition(int[] arr,int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<arr[high]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        pivot=temp;
        return i;
    }
}
