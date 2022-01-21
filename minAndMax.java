/**
 * Min and Max of a array
 */
public class minAndMax {

    public static void minandmax(int arr[],int n) {
        int max=arr[0];
        int min=arr[0];
        if(n==1){
            System.out.println("Maximum"+arr[0]);
            System.out.println("Minimum"+arr[0]);
        }

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
    }
    public static void main(String args[]) {

        int arr[]={4,3,45,767,967,1,9,8};
        int n=arr.length;
        minandmax(arr,n);
        
    }
}
