import java.util.Arrays;

/**
 * Minimize the Heights II
 */
 public class minTowerHeight {
 
     public static void main(String args[]) {
         int arr[]={1, 5, 8, 10};
         int n=arr.length;
         int target=4;
         int res=minTower(arr,n,target);
         System.out.print(res);

     }

    public static int minTower(int[] arr, int n ,int k) {
        Arrays.sort(arr);
        int res=arr[n-1]-arr[0];
        int max=arr[n-1]-k;
        int min=arr[0]+k;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,arr[i]+k);
            min=Math.min(min,arr[i+1]-k);
            if(min<0){
                continue;
            }
            res=Math.min(res,max-min);
        }

        return res;
    }
 }