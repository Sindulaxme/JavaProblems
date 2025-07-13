import java.util.*;
class StringLastRepetation{
  String s3=new String();
     String newString(String s, int x){
        int n=s.length();
        int k=x;
        if(x<n){
            while(k>0){
             for(int i=n-x; i<n; i++){
            s3=s3+s.charAt(i);
          }
          k--;
            }

        }  
        return s3;
     }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        int x=sc.nextInt();
      StringLastRepetation sob = new StringLastRepetation();
       System.out.println(sob.newString(s1,x));
    }
}