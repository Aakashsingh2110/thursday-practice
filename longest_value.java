import java.util.Scanner;

public class longest_value {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int max = arr[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Element of Array ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max value is " + max);
    }
}
