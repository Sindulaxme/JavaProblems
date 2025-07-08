import java.util.*;
class Arraysorting{
    public static void main (String args []){
         Scanner ss=new Scanner(System.in);
       System.out.println("Enter array size");
       int n=ss.nextInt();
       int a[]= new int[n];
       System.out.println("Enter values:");
       for(int i=0; i<a.length; i++){
        a[i]=ss.nextInt();
       }
       for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
       } 
       for(int i=0; i<a.length; i++){
        System.out.print(a[i]+ " ");
       }}
}