import java.util.*;
class SumofIntArray{
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array values");
        for(int i=0; i<a.length; i++){
               a[i]=sc.nextInt();
        }
        int sum=0,avg=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
         avg=sum/n;
         System.out.println("Sum "+sum+" Average "+avg);
    }
}