import java.util.*;
class StringLengthBasedoutput{
    String s2=new String();
     String newString(String s){
        int n=s.length();
        if(n%2==0){
            for(int j=0; j<n/2; j++){
              s2=s2+s.charAt(j);
            }
        }
        else{
            s2=null;
        }

        return s2;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
       StringLengthBasedoutput sob = new StringLengthBasedoutput();
        System.out.println(sob.newString(s1));
    }
}