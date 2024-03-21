public class quicksort {
    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //pivot index
    }
    public static void quick(int arr[], int low, int high){
        if(low<high){
            int  pidx = partition(arr, low, high);
            quick(arr,low,pidx-1);
            quick(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,1,64,3,6,89,60,8};
        int n=arr.length;
        System.out.println("Before quick sort: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quick(arr,0,n-1);

        System.out.println("After quick sort: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
