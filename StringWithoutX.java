import java.util.*;
class StringWithoutX{
  String s3=new String();
     String newString(String s){
        int n=s.length();
          if(s.charAt(0)=='X'||s.charAt(0)=='x'){
             for(int i=1; i<n; i++){
             s3=s3+s.charAt(i);}
          }

       else if(s.charAt(n-1)=='x'||s.charAt(n-1)=='X'){
            for(int i=0; i<n-1; i++){
              s3=s3+s.charAt(i);}
        } 
        else{
          s3=s;
        }
        return s3;
     }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        StringWithoutX sob = new StringWithoutX();
       System.out.println(sob.newString(s1));
    }
}