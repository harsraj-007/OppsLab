import java.util.*;
public class LAB2P7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,1,1,4,5,6,4,8,9,6,9,4,8};
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int arr1[]=new int[pos+1];
        int arr2[]=new int[arr.length-(pos+1)];

        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i<pos+1){
                arr1[j]=arr[i];
                j++;
            }
            else{
                arr2[k]=arr[i];
                k++;
            }
        
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);



        System.out.println("Duplicate elements present in Array1: ");
        for(int i=0; i<arr1.length; i++){
            int count=1;
            while(i<arr1.length-1 && arr1[i]==arr1[i+1]){
                count++;
                i++;
            }
            System.out.println(arr1[i]+"- "+count+" times.");
        }

        System.out.println("Duplicate elements present in Array2: ");
        for(int i=0; i<arr2.length; i++){
            int count=1;
            while(i<arr2.length-1 && arr2[i]==arr2[i+1]){
                count++;
                i++;
            }
            System.out.println(arr2[i]+"- "+count+" times.");
        }

        

    }
}