import java.util.*;
public class LAB2P6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int j=0; int k=0;
        int arrEven[] = new int[n/2];
        int arrOdd[] = new int[n/2];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                arrEven[j]=arr[i];
                j++;
            }
            else{
                arrOdd[k]=arr[i];
                k++;
            }
            
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            System.out.print(arrEven[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            System.out.print(arrOdd[i]+" ");
        }
        
    }
}
