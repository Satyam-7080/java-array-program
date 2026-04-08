import java.util.Scanner;
public class occurance{
        public static void main(String[] args){
            System.out.println("Welcome in array operation ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i= 0; i<size; i++){
                System.out.println("Enter the "+(i+1) +" element:");
                arr[i] = sc.nextInt();

            }
            System.out.println("Enter the number which you want to know that is occur: ");
            int key = sc.nextInt();

            int Occure = occure(arr,key);
            System.out.println("The number is "+ key +" is "+Occure+" times occure.");
        }
         public static int occure(int[] arr,int key){
             int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==key){
                    count++;
                }
            }
                return count;
         }
}