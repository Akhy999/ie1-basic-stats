import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number count:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }

        int min = arr[0], max=arr[0];
        for (int i : arr) {
            if(i>max)
            max=i;
            if(i<min)
            min=i;
        }

        System.out.println("The maximum number is: "+max);
        System.out.println("The minimum number is: "+min);

    }
}
