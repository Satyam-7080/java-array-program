import java.util.Scanner;
public class min_N_Max_in_Array {
    public static void main(String[] args){
        System.out.print("Welcome, in Array operation \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
            i++;
        }
        int min = arr[0],max = arr[0];
       int mini= findMin(arr,min);
      int maxi= findMax(arr,max);
        System.out.println("The minimum value in given array is "+mini);
        System.out.println("The maximum value in given array is "+maxi);

    }

    public static int findMin(int[] arr, int min){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr,int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
