public class LAB3P5 {
    
    public static void main(String[] args){
        alpha(new int[]{1,2,3,4});
         
    }
    public static void alpha(int[] arr){
        int count=0;
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
            count +=arr[i];
            
        }
        System.out.println();
        System.out.println(count);
    }

}
