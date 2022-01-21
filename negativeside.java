
/**
 * move negative elemts to one side of array
 */
public class negativeside {
    public static int[]  moveNegative(int arr[],int n) {
        int left=0;
        int right=n-1;
        int temp;
        while(left<=right){
            if(arr[left]<0 && arr[right]>0){
                left++;
                right--;
            }
            if(arr[left]>0 && arr[right]<0){
                temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
            }

            if(arr[right]<0 && arr[left]<0){
                left++;
            }
              if(arr[right]>0 && arr[left]>0){
                right--;
            }
        }

        return arr;
    }
    public static void main(String args[]){
        int arr[]={2,-9 ,10, 12, 5, -2, 10, -4};
        int n=arr.length;
       int ans[]= moveNegative(arr,n);
       for(int i=0;i<n;i++){
           System.out.print(ans[i] +" ");
       }
    }
}