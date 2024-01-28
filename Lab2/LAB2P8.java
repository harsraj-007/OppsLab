import java.util.*;
public class LAB2P8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,91,23,3,46,78,88,9};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}