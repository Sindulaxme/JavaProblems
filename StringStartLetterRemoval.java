import java.util.*;
class StringStartLetterRemoval{
  String s3=new String();
     String newString(String s){
        int n=s.length();
        int x=0;
          for(int i=0; i<n; i++){
            if(s.charAt(i)=='*'){
                x=i;
            }
          }
          for(int i=0; i<n; i++){
            if(i!=x&&i!=x-1 &&i!=x+1){
               s3=s3+s.charAt(i);
            }
          }
        return s3;
     }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        StringStartLetterRemoval sob = new StringStartLetterRemoval();
       System.out.println(sob.newString(s1));
    }
}