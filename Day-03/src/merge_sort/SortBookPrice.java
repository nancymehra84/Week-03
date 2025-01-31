package merge_sort;

public class SortBookPrice {

    public static void mergeSort(int price[],int left,int right){
        if(left>=right){
            return;
        }
        int mid =left+(right-left)/2;
        mergeSort(price,left,mid);
        mergeSort(price,mid+1,right);
        merge(price,left,mid,right);
    }
    public static void merge(int price[],int left, int mid ,int right){
        int merged[]=new int [right-left+1];
        int idx1=left;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=right){
            if(price[idx1]<=price[idx2]){
                merged[x]=price[idx1];
                x++;idx1++;
            }else{
                merged[x]=price[idx2];
                x++;idx2++;
            }
        }
        while(idx1<=mid ){
            merged[x]=price[idx1];
            x++;idx1++;
        }
        while(idx2<=right){
            merged[x]=price[idx2];
            x++;idx2++;
        }
        for(int i=0,j=left;i<merged.length;i++,j++){
            price[j]=merged[i];
        }
    }
    public static void main(String[] args){
        int price[]={200,400,100,600,500};
        int n=price.length;
        mergeSort(price,0,n-1);
        System.out.println("Sorted price array:");
        for (int i=0;i<price.length;i++){
            System.out.print(price[i]+" ");
        }
        //System.out.println();
    }
}
