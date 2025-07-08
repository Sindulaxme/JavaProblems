import java.util.*;
class LargestandShortesnum{
    public static void main (String args []){
         Scanner ss=new Scanner(System.in);
       System.out.println("Enter array size");
       int n=ss.nextInt();
       int a[]= new int[n];
       System.out.println("Enter values:");
       for(int i=0; i<a.length; i++){
        a[i]=ss.nextInt();
       } 
       int max=0;
       int min=10000000;
       int maxxx=0;
       int minnn=10000000;
       for(int i=0; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
        }
       }
         for(int i=0; i<a.length; i++){
            if(max!=a[i]&&maxxx<a[i]){
                maxxx=a[i];
            }
            if(min!=a[i]&&minnn>a[i]){
                minnn=a[i];
        }
       }
       System.out.println("Largers numbers " +max + " "+ maxxx);
        System.out.println("Smallest numbers " +min + " "+ minnn);
    }
}