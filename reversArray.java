/**
 * reversArray
 */
public class reversArray {

    public static void main(String args[]){
       int arr[] ={1,2,3,4,5};
       int n=arr.length;
       printArray(arr,n);
       reverseArray(arr,n);
       System.out.println();
       System.out.println("reverse array");
       printArray(arr,n);
    }

    public static void printArray(int[] arr, int n) {

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void reverseArray(int[] arr,int n){
        int temp;
        int start=0;
        int end=n-1;
        //1 2 3 4 5
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


}