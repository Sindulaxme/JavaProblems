import java.util.*;
class CombinationOfTwoString{
  String s3=new String();
     String newString(String s, String ss){
        int n=s.length();
        int k=ss.length();
        int x=n>k?k:n;
          for(int i=0; i<x; i++){
            s3=s3+s.charAt(i)+ss.charAt(i);
          }
        return s3;
     }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
       CombinationOfTwoString sob = new CombinationOfTwoString();
       System.out.println(sob.newString(s1,s2));
    }
}