import java.util.*;
class CheckgivennuminArray{
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array values");
        for(int i=0; i<a.length; i++){
               a[i]=sc.nextInt();
        }
        System.out.println("Enter the refered number");
        int k=sc.nextInt();
        int x=0;
        for(int i=0; i<a.length; i++){
            if(k==a[i]){
                   x=i;
                   break;
            }
            else{
                   x=-1;
            }
        }
        System.out.println(x);
    }
}