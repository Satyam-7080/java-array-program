import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome in Array operations");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0, sum = 0;
        while (i<size){
            System.out.println("Enter the "+i+" index value ");
            arr[i] = sc.nextInt();
            sum +=arr[i];
            i++;
        }
        double avg = (double)sum/size;
        System.out.println("the sum of all elements: "+sum);
        System.out.println("the avg of all elements: "+avg);

    }
}