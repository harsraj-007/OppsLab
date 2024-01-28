import java.util.*;
public class LAB2P4{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int arr[] = {10,91,23,3,46,78,88,9};
        System.out.print("Enter the element you want to find: ");
        int element = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(element==arr[i]){
                System.out.println("Element found at index "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");


    }
}