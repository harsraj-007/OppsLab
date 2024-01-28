import java.util.*;
public class LAB2P3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the total elements: ");
        int totalElements = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<totalElements;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the loc: ");
        int loc = sc.nextInt();

        for(int i=loc;i<totalElements;i++){
            arr[i]=arr[i+1];
        
        }
        for(int i=0;i<totalElements-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}