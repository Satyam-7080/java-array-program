public class bubbleSort {
    public static void main(String[] args){
        int arr[] = {19,45,13,34,12,6,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}