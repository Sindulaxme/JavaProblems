import java.util.*;
class SumofElementArraywosucceding{
    public static void main (String args []){
         Scanner ss=new Scanner(System.in);
       System.out.println("Enter array size");
       int n=ss.nextInt();
       int a[]= new int[n];
       System.out.println("Enter values:");
       for(int i=0; i<a.length; i++){
        a[i]=ss.nextInt();
       } 
       int sum=0;
       int k=0,m=0;
      
       for(int i=0; i<a.length; i++){
      if(a[i]==6)  k=i;
      if(a[i]==7) m=i;
       }
       int x=m-k;
       for(int i=0;i<a.length; i++){
        if(x>0){
        if(i>=k && i<=m){
            continue;
        }
        else{
            sum+=a[i];
        }
       }
       else{
             sum=sum+a[i];
       }
       }

       System.out.print(sum);
    }
}