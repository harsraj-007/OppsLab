import java.util.*;
public class LAB2P1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int sizeOfArray = sc.nextInt();
        System.out.println("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();
        int arr[] = new int[sizeOfArray];

        for(int i=0;i<numberOfElements;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<numberOfElements;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}