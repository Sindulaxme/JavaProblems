import java.util.*;
class TwoStringintoSlS{
    String s3=new String();
     String newString(String s, String ss){
        int n=s.length();
        int k=ss.length();
       if(n>k){
        s3=ss+s+ss;
       }
       else{
        s3=s+ss+s;
       }
        return s3;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
       TwoStringintoSlS sob = new TwoStringintoSlS();
        System.out.println(sob.newString(s1,s2));
    }
}