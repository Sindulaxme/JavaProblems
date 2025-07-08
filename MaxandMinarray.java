import java.util.*;
class MaxandMinarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array values");
        for(int i=0; i<a.length; i++){
               a[i]=sc.nextInt();
        }
        int min=a[n-1], max=0;
        for(int i=0; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
         for(int i=0; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Max: "+ max +" Min: "+min);
    }
}