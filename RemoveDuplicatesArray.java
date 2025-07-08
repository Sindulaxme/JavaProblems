import java.util.*;
class RemoveDuplicatesArray{
    public static void main (String args []){
         Scanner ss=new Scanner(System.in);
       System.out.println("Enter array size");
       int n=ss.nextInt();
       int a[]= new int[n];
       System.out.println("Enter values:");
       for(int i=0; i<a.length; i++){
        a[i]=ss.nextInt();
       } 
       for(int i=0; i<a.length; i++){
        for(int j=0; j<a.length-1; j++){
            if(i!=j && a[i]==a[j]){
               
                a[j]=0;
                break;
            }
            
        }
       }
       for(int i=0; i<a.length; i++){
        if(a[i]==0) continue;
        
         System.out.print(a[i]+" ");
       }
    }
}