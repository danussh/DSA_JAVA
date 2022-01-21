/**
 * sortArray on 0 1 2 
 */
public class sortArray {
    public static int[] sortarray(int arr[], int n){
        int temp;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                        mid++;
                        low++;
                        break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
        return arr;
    }
    
    public static void main(String args[]){
        int arr[]={2,0,0,2,1};
        int n=arr.length;
        int x[]= sortarray(arr,n);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i] + " ");
        }
    }
}