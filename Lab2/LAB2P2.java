import java.util.*;
public class LAB2P2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int sizeOfArray = sc.nextInt();
        System.out.print("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();
        int arr[] = new int[sizeOfArray];

        for(int i=0;i<numberOfElements;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the pos: ");
        int pos = sc.nextInt();

        System.out.print("Enter the element: ");
        int element = sc.nextInt();

        for(int i=numberOfElements-1;i>=pos;i--){
            arr[i+1]=arr[i];
            if(i==pos){
                arr[i]=element;
            }
            
        }
        for(int i=0;i<=numberOfElements;i++){
            System.out.print(arr[i]+" ");
        }
    }
}