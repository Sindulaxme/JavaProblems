import java.util.*;
class CompareAndConcat{
  String s3=new String();
     String newString(String s, String ss){
        int n=s.length();
        int x=ss.length();
        int v=0;
       while((v=s.indexOf(ss,v))!=-1){
            if(v>0){
                s3=s3+s.charAt(v-1);
            }
            if(v+x<n){
                s3=s3+s.charAt(v+x);
            }
            v+=x;
       } 
        return s3;
     }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
      CompareAndConcat sob = new CompareAndConcat();
       System.out.println(sob.newString(s1,s2));
    }
}